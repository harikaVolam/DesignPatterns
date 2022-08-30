package ProxyPattern;


//Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.
//Proxies are also called surrogates, handles, and wrappers. They are closely related in structure, but not purpose, to Adapters and Decorators.

//Depending on intent of proxy. Proxies are divided into 3 types
//1.Remote
//2.Virtual -> like cache
//3.Protection
//pre-processing and post processing

//This patterns adds a behaviour with the intent of protection underlying classes

//https://www.geeksforgeeks.org/proxy-design-pattern/ -> Read this
public class Client
{
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
