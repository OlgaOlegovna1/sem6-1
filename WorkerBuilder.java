пакет  Семинар06 ;

        открытый  класс  WorkerBuilder {
        общедоступный  статический  экземпляр WorkerBuilder  = null ;
        Рабочий  объект ;

        общественный  WorkerBuilder () {
        }
        общедоступный  статический  WorkerBuilder  getInstance () {
        если ( экземпляр == ноль )
        экземпляр = новый  WorkerBuilder ();
        экземпляр . obj = новый  рабочий ();
        вернуть  экземпляр ;
        }
public  WorkerBuilder  setName ( имя строки  ) {
        объект . setName ( имя );
        вернуть  это ;
        }
        публичный  WorkerBuilder  setSalary ( зарплата int  ) {
        объект . setSalary ( зарплата );
        вернуть  это ;
        }
        общедоступный  WorkerBuilder  setPhoneNumber ( int  phoneNumber ) {
        объект . установитьНомерТелефона ( номертелефона );
        вернуть  это ;
        }
        публичная  сборка рабочего  (){
        вернуть  объект ;
        }

@ Переопределить
    общедоступная  строка  toString () {
            вернуть  "WorkerBuilder{" +
            "объект=" + объект +
            '}' ;
            }
            }