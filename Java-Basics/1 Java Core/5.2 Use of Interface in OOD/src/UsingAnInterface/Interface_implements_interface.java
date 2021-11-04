package UsingAnInterface;

import interfaces.NewInterface;

class man implements ceramicToy,toy,electricDivaice,NewInterface{

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }

    @Override
    public void dupa() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }

    @Override
    public void metoda2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String metoda4(String answer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void metoda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String metoda3(String answer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

interface toy{
    void play();
}
interface ceramicToy extends toy{
     void dupa(); 
}
interface electricDivaice{
    
}


