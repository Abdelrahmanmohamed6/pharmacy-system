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
//    cashir, delivery, cleaner,
//}
public class Service extends Employee {

//    private Mission mission2;
    public Service(String name, int id, String phone_number, String missions) {
        super(name, id, phone_number);
        setVacation_day(4);
        setMission(missions);

        try {
//            mission2 = Mission.valueOf(missions);
//            setMission(mission2);
            switch (missions) {
                case "delivery":
                    super.setDaily_hours_price(200);
                    super.setDaily_hours(8);
                    break;
                case "cleaner":
                    super.setDaily_hours_price(200);
                    super.setDaily_hours(8);
                    break;
                case "cashir":
                    super.setDaily_hours_price(300);
                    super.setDaily_hours(8);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.err.println("RE ENTRE THE MISSIONS AS (cashir, delivery, cleaner)");
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
            return BaseSalary() + (int) (diff * 1.5 * getDaily_hours_price()) / 30;
        } else if (getVacation_day() > 0) {//to calculate vacation day over time
            return BaseSalary() + (int) (getVacation_day() * BaseSalary() * 1.5) / 30;

        } else {
            return BaseSalary();
        }

    }
}
