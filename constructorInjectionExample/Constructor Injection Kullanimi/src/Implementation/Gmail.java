package Implementation;

import Interface.Provider;

public class Gmail implements Provider {
    @Override
    public String sentEmail() {
        return "Gmail";
    }
}
