package BeansBusinessException;

import javax.naming.InsufficientResourcesException;

public class BeansBusinessTest {
    public static void main(String[] args) {

        BeansPurchaseException purchase = new BeansPurchaseException();

        try{
           Beanss beanss = purchase.buyBeans(50) ;

        }
        catch (LackOfMoneyException ex){
            System.out.println(ex);
        }
    }
}
