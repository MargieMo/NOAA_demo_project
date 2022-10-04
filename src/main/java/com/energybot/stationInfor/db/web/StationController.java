package com.energybot.stationInfor.db.web;

import com.energybot.stationInfor.db.dao.StationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StationController {
    @Autowired
    private StationDao stationDao;

    // another way.
    @RequestMapping(value="/search/{stationId}",method= RequestMethod.GET)
    public String searchStationId(@PathVariable("stationId") String stationId){
        return stationDao.queryStationByStationId(stationId).toString();
    }

    @RequestMapping(value="/search",method= RequestMethod.GET)
    public String searchByParam(@RequestParam("stationId") String stationId){
        try {
            String result = stationDao.queryStationByStationId(stationId).toString();
            if (result.length() < 3) return "Station Id cannot find please double check";
            return result;
        }catch (Error e){
            return "Please try again later.";
        }
    }

}
