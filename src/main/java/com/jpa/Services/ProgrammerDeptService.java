package com.jpa.Services;

import com.jpa.dao.ProgrammerDeptDao;
import com.jpa.input.InputReader;

public class ProgrammerDeptService {
    ProgrammerDeptDao pdd = new ProgrammerDeptDao();
    InputReader ir = new InputReader();

    public void saveProgammersList() {
        pdd.persistTheProgrammerSkills(ir.createProgrammerList());
    }

}
