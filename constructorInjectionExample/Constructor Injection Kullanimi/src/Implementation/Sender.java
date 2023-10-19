package Implementation;

import Interface.Provider;

public class Sender {
    Provider theProvider;

    public Sender(Provider provider){
        this.theProvider = provider;
    }

    public String Publish(){
        System.out.println(theProvider.sentEmail());
        return theProvider.sentEmail();
    }
}
