/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

/**
 *
 * @author DELL
 */
public class Medical extends Product {

    public Medical(String name, String Source) {
        super(name, Source);
        setGain(1.25);
    }

    
    @Override
    public void MximumDiscount(double discount) {
            if (discount <= 0.15) {
                setDiscount(discount);
            } else {
                setDiscount(0.15);//if greater than 15% set it only 15%
            }
        }
    
}
