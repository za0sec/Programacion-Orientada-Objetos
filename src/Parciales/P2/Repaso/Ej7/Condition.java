package Parciales.P2.Repaso.Ej7;

import java.time.LocalDate;

public enum Condition {


    STUDENT{
        public LocalDate addDate(LocalDate date){ // yo hice las consultas aca.
            return date.plusDays(2);
        }
    },
    RESPONSIBLE{
        public LocalDate addDate(LocalDate date){
            return date.plusDays(12);
        }
    },
    TPCHIEF{
        public LocalDate addDate(LocalDate date){
            return date.plusDays(11);
        }
    },
    ASSISTANT {
        public LocalDate addDate(LocalDate date){
            return date.plusDays(10);
        }
    };

    public abstract LocalDate addDate(LocalDate date);

}
