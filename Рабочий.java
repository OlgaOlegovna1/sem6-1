пакет  Семинар06 ;

        работник общественного класса  {
        общедоступное  строковое  имя ;
        государственная  зарплата  ; _
        общедоступный  номер  телефона ;
        публичный  логический  отпуск ;

        публичная  строка  getName () {
        вернуть  имя ;
        }

public  void  setName ( имя строки  ) {
        это . имя = имя ;
        }

        общественный  интервал  getSalary () {
        вернуть  заработную плату ;
        }

public  void  setSalary ( зарплата int  ) {
        это . зарплата = зарплата ;
        }

        публичный  интервал  getPhoneNumber () {
        вернуть  номер телефона ;
        }

public  void  setPhoneNumber ( int  phoneNumber ) {
        это . номер телефона = номер телефона ;
        }

        общественное  логическое значение  isVacation () {
        обратный  отпуск ;
        }

public  void  setVacation ( логический  отпуск ) {
        это . отпуск = отпуск ;

        }

@ Переопределить
    общедоступная  строка  toString () {
            вернуть  "Рабочий{" +
            "имя='" + имя + '\'' +
            ", зарплата=" + зарплата +
            ", номер телефона=" + номер телефона +
            ", отпуск=" + отпуск +
            '}' ;
            }
            }