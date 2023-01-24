package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text = "Content";//Kullanici giriyormus gibi dusunduk, sifrelenmesini istedigimiz content

        AESEncyrptor aesEncyrptor = new AESEncyrptor();
        aesEncyrptor.encyrpt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encyrpt(text,"SecretKey");





        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encyrpt(text,"SecretKey",true);//Ayni isi yapan iki method aslinda


        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text, EncryptorFacade.EncType.SHA);
    }
}
