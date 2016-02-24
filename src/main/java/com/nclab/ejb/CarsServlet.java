package com.nclab.ejb;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CarsServlet extends HttpServlet {

    @EJB
    Parking parking;
    @EJB
    ParkingStat parkingStat;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Car> cars = parking.getCars();
        request.setAttribute("parking", cars);

        request.setAttribute("fastcar",parkingStat.getFastestCar(cars));
        request.setAttribute("heavycar",parkingStat.getHeaviestCar(cars));
        request.getRequestDispatcher("parking.jsp").forward(request, response);
    }

}
