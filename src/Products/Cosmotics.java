/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

/**
 *
 * @author DELL
 */
public class Cosmotics extends Product {

    public Cosmotics(String name, String Source) {
        super(name, Source);
        setGain(1.40);
    }

    
    @Override
    public void MximumDiscount(double discount) {
        if (discount <= 0.25) {
            setDiscount(discount);
        } else {
            setDiscount(0.25);//if greater than 25% set it only 25%
        }
    }

}
