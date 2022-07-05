package com.google.sps.servlets;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URL;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;

import dev.katsute.onemta.bus.Bus;
import dev.katsute.onemta.railroad.LIRR;
import dev.katsute.onemta.railroad.MNR;
import dev.katsute.onemta.subway.Subway;
import dev.katsute.onemta.DataResource;
import dev.katsute.onemta.DataResourceType;
import dev.katsute.onemta.MTA;

import java.util.Arrays;


@WebServlet("/mta")
public class mtaServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    MTA mta = mta = MTA.create(
        busToken,
        subwayToken,
        DataResource.create(DataResourceType.Bus_Bronx, new File("google_transit_bronx.zip")),
        DataResource.create(DataResourceType.Bus_Brooklyn, new File("google_transit_brooklyn.zip")),
        DataResource.create(DataResourceType.Bus_Manhattan, new File("google_transit_manhattan.zip")),
        DataResource.create(DataResourceType.Bus_Queens, new File("google_transit_queens.zip")),
        DataResource.create(DataResourceType.Bus_StatenIsland, new File("google_transit_staten_island.zip")),
        DataResource.create(DataResourceType.Bus_Company, new File("google_transit_bus_company.zip")),
        DataResource.create(DataResourceType.Subway, new File("google_transit_subway.zip")),
        DataResource.create(DataResourceType.LongIslandRailroad, new File("google_transit_lirr.zip")),
        DataResource.create(DataResourceType.MetroNorthRailroad, new File("google_transit_mnr.zip"))
    );
    Bus.Route M1    = mta.getBusRoute("M1", DataResourceType.Bus_Manhattan);
  }
}
