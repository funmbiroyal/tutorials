package BeansBusinessException;

import javax.naming.InsufficientResourcesException;

public class BeansPurchaseException  {
    public Beanss buyBeans(int amount) throws InsufficientResourcesException {
if(amount == 100 ){
    System.out.println("You just bought a plate of beans!");
    return new Beanss();
}
else
    throw new InsufficientResourcesException("Your money is not sufficient");
    }


}
