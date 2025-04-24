package com.jpa.Model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmployeesModel implements Serializable {

    private long emp_id;
    private long login_id;

    public EmployeesModel(long emp_id, long login_id) {
        this.emp_id = emp_id;
        this.login_id = login_id;

    }

    public EmployeesModel() {
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EmployeesModel))
            return false;
        EmployeesModel em = (EmployeesModel) o;
        return emp_id == em.emp_id && login_id == em.login_id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_id, login_id);
    }

}
