пакет  Семинар06 ;

        общественный  класс  Основной {
public  static  void  main ( String [] args ) {
        Рабочий рабочий = WorkerBuilder . получить экземпляр (). setName ( "Александра" ). setPhoneNumber ( 456465 ). построить ();
        Система . вне . println ( рабочий );
        рабочий . установитьЗарплата ( 100000 );
        Система . вне . println ( рабочий );
        }
        }