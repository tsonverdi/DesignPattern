package StructuralDP.FacadeDP;

public class EncryptorFacade {

    private AESEncyrptor aesEncyrptor = new AESEncyrptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text,EncType encType ){
        switch (encType){
            case AES:aesEncyrptor.encyrpt(text);
            break;
            case MD5:md5Encryptor.encyrpt(text,"KEY");
            break;
            case SHA:shaEncryptor.encyrpt(text,"KEY",true);
            break;
            default:throw new IllegalArgumentException(encType.toString());
        }

    }

    public enum EncType{
        SHA,
        MD5,
        AES
    }
}
