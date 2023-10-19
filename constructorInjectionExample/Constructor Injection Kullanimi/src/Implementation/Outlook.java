package Implementation;

import Interface.Provider;

public class Outlook implements Provider {
    @Override
    public String sentEmail() {
        return "Outlook";
    }
}
