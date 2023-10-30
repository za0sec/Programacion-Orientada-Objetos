package Parciales.P2.Repaso.Ej6;

public enum QuotaType {

    LIMITED{
        public boolean canRead (int actualRead){
            return actualRead <= 2;
        }
        public boolean canWrite(int actualWrite){
            return actualWrite <= 1;
        }
    },
    UNLIMITED{
        public boolean canRead(int actualRead){
            return true;
        }
        public boolean canWrite(int actualWrite){
            return true;
        }
    };

    public abstract boolean canRead(int actualRead);
    public abstract boolean canWrite(int actualWrite);



}
