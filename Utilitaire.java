package utilitaire;
public class Utilitaire{
    public String getMethode(String url){
        String[] meth=url.split("/");
        return meth[2];
    }
}