package com.jpa.Services;

import com.jpa.Model.EmployeesModel;
import com.jpa.Model.PanchaCafeModel;
import com.jpa.dao.CafePanachaDao;

public class EmployeeCafePanchaService {
    CafePanachaDao cpd = new CafePanachaDao();
    EmployeesModel emo = new EmployeesModel(12L, 23L);
    PanchaCafeModel pcmo = new PanchaCafeModel(emo, "saikiran");

    public void saveTheCafePancha() {
        cpd.persistCafePancha(pcmo);
    }

}
