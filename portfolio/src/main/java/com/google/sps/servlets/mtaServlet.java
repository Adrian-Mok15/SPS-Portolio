package com.google.sps.servlets;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URL;

import java.io.File;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;

import dev.katsute.onemta.bus.Bus;
import dev.katsute.onemta.railroad.LIRR;
import dev.katsute.onemta.railroad.MNR;
import dev.katsute.onemta.subway.Subway;
import dev.katsute.onemta.DataResource;
import dev.katsute.onemta.DataResourceType;
import dev.katsute.onemta.MTA;
import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;
import dev.katsute.onemta.api_keys;

import java.util.Arrays;


@WebServlet("/mta")
public class mtaServlet extends HttpServlet {
    // MTA mta = MTA.create(
    //     api_keys.bus,
    //     api_keys.subway,
    //     DataResource.create(DataResourceType.Bus_Bronx, new File("/src/main/java/com/google/sps/servlets/google_transit_bronx.zip")),
    //     DataResource.create(DataResourceType.Bus_Brooklyn, new File("google_transit_brooklyn.zip")),
    //     DataResource.create(DataResourceType.Bus_Manhattan, new File("google_transit_manhattan.zip")),
    //     DataResource.create(DataResourceType.Bus_Queens, new File("google_transit_queens.zip")),
    //     DataResource.create(DataResourceType.Bus_StatenIsland, new File("google_transit_staten_island.zip")),
    //     DataResource.create(DataResourceType.Bus_Company, new File("google_transit_bus_company.zip")),
    //     DataResource.create(DataResourceType.Subway, new File("google_transit_subway.zip")),
    //     DataResource.create(DataResourceType.LongIslandRailroad, new File("google_transit_lirr.zip")),
    //     DataResource.create(DataResourceType.MetroNorthRailroad, new File("google_transit_mnr.zip"))
    // );

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Bus.Route M1    = mta.getBusRoute("M1", DataResourceType.Bus_Manhattan);
    // String textValue = Jsoup.clean(request.getParameter("text-input"), Safelist.basic());
    // Bus.Stop stop   = mta.getBusStop(Integer.parseInt(textValue));
    // Subway.Route route = mta.getSubwayRoute("SI");

    // Bus.Vehicle v;
    // v.getDirection()
    // // response.getWriter().println(stop.getLatitude() + stop.getLatitude());
    // // String test = getServletContext().getRealPath("google_transit_staten_island.zip");
    // String test = getClass().getResource("/google_transit_staten_island.zip").getPath();

    // test = getServletContext().getRealPath("/software-product-sprint/portfolio/src/main/webapp/WEB-INF");
    
    // response.getWriter().println(test + "bing");
    // File temp = new File(test);
    // // File temp1 = new File("/portfolio/src/main/java/com/google/sps/servlets/google_transit_staten_island.zip");
    // // File temp2 = new File("/src/main/java/com/google/sps/servlets/google_transit_staten_island.zip");
    // // File temp3 = new File("/main/java/com/google/sps/servlets/google_transit_staten_island.zip");
    // if(!temp.exists()){
    //     response.getWriter().println(temp.getPath() + "\n");
    // }

    // if(!temp1.exists()){
    //     response.getWriter().println(temp1.getPath() + "\n");
    // }

    // if(!temp2.exists()){
    //     response.getWriter().println(temp2.getPath() + "\n");
    // }

    // if(!temp3.exists()){
    //     response.getWriter().println(temp3.getPath() + "\n");
    // }

        
    response.getWriter().println(api_keys.bus + " " + api_keys.subway);
        
    }
}
