package Chapter4;

public class Encryption {
    private int encryptedMessage;
    private int decryptedMessage;

    public void encrypt(int message){
        int firstDigit = message/1000;
        int store1 = message%1000;
        firstDigit = (firstDigit + 7) % 10;

        int secondDigit = store1/100;
        int store2 = store1%100;
        secondDigit = (secondDigit + 7) % 10;

        int thirdDigit = store2/10;
        int store3 = store2%10;
        thirdDigit = (thirdDigit + 7) % 10;

        int fourthDigit = store3;
        fourthDigit =(fourthDigit + 7) % 10;


        thirdDigit*=1000;
        fourthDigit*=100;
        firstDigit*=10;


this. encryptedMessage =thirdDigit+fourthDigit+firstDigit+secondDigit ;
    }

public int getEncryptedMessage(){

        return encryptedMessage;
  }
  public void decrypt(int message){
        int firstDigit = message/1000;
       int firstStore = message%1000;


       int secondDigit = firstStore/100;
       int secondStore = firstStore%100;


       int thirdDigit = secondStore/10;
       int thirdStore = secondStore%10;


      int fourthDigit = thirdStore;
      int fourthStore = thirdStore;

       if(firstDigit < 7){
           firstDigit += 10-7 ;
       }else
           firstDigit-=7;
       if(secondDigit < 7){
           secondDigit +=10-7;
      } else
          secondDigit-=7;
      if (thirdDigit < 7){
          thirdDigit +=10-7;
      }else
          thirdDigit-=7;
      if (fourthDigit < 7){
          fourthDigit +=10-7;
      }else
          fourthDigit-=7;

      thirdDigit *= 1000;
      fourthDigit *= 100;
      firstDigit *= 10;
      this.decryptedMessage = thirdDigit + fourthDigit + firstDigit + secondDigit;
  }

  public int getDecryptedMessage(){

        return this.decryptedMessage;
  }

}

