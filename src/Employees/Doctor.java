/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

/**
 *
 * @author DELL
 */
//enum Mission {
//    manager, owner, worker,
//}
public class Doctor extends Employee {

//    private Mission mission1;
    public Doctor(String name, int id, String phone_number, String missions) {
        super(name, id, phone_number);
        setVacation_day(6);
        ChickMission(missions);
    }

    public void ChickMission(String missions) {
//
//        try {
//            mission1 = Mission.valueOf(missions);
//            setMission(mission1);
//        } catch (Exception e) {
//            System.err.println("RE ENTRE THE MISSIONS AS (manager, owner, worker)");
//        }
        try {

            setMission(missions);
            switch (missions) {
                case "owner":
                    super.setDaily_hours_price(1500);
                    super.setDaily_hours(4);
                    break;
                case "manager":
                    super.setDaily_hours_price(1000);
                    super.setDaily_hours(10);
                    break;
                case "worker":
                    super.setDaily_hours_price(600);
                    super.setDaily_hours(12);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.err.println("RE ENTRE THE MISSIONS AS (manager, owner, worker)");
        }
    }

    /**
     *
     * @param daily_hours
     * @return
     */
    @Override
    public int ChickOverTime(double daily_hours) {

        if (daily_hours > getDaily_hours()) {//to calculate hourse over time
            double diff = daily_hours - getDaily_hours();
            setDaily_hours(daily_hours);
            return BaseSalary() + (int) (diff * 2 * getDaily_hours_price()) / 30;
        } else if (getVacation_day() > 0) {//to calculate vacation day over time
            return BaseSalary() + (int) (getVacation_day() * BaseSalary() * 2) / 30;

        } else {
            return BaseSalary();
        }
    }

}
