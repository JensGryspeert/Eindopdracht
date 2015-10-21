# DB Opmaak #
## Entiteiten ##
1.  Users
2.  Event_Detail
3.  Agenda
4.  Contact
5.  Events_Registered
6.  Widgets

### Users ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int                 |autoinc(PK)|
|name        |varchar(50)         |-|
|forename    |varchar(50)         |-|
|birthDate   |unixStamp           |-|
|firm        |varchar(30)         |-|
|function    |varchar(30)         |-|
|photo       |varchar(255)        |-|
|email       |varchar(255)        |unique|
|password    |varchar(255)->MD5   |-|
|loggedIn    |tinybit             |-|
|created_at  |datetime            |NOW()|
|updated_at  |datetime            |NOW()-->method update|

### Event_Detail ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int                 |autoinc(PK)|
|title       |varchar(30)         |-|
|loc_img     |varchar(255)        |-|
|adres       |varchar(255)        |-|
|datum       |date                |-|
|fee         |varchar(30)         |-|
|for_who     |varchar(255)        |-|    
|omschijving |memo                |-|
|agenda_id   |int                 |index(Agenda->agenda_id)|
|created_at  |datetime            |NOW()|
|updated_at  |datetime            |NOW()-->method update|

### Agenda ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id                  |int                 |autoinc(PK)|
|event_detail_id     |int                 |index(event_detail->id)|
|beg_uur             |unixstamp           |-|
|eind_uur            |unixstamp           |-|
|created_at          |datetime            |NOW()|
|updated_at          |datetime            |NOW()-->method update|

### Contact ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int             |autoinc(PK)|
|name        |varchar(50)     |-|
|beschr      |memo            |-|
|created_at  |datetime        |NOW()

### Events_Registered ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int     |autoinc(PK)|
|event_id    |int     |index(Event_detail ->id)|
|user_id     |int     |index(Users->id)|

### Widgets ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int             |autoinc(PK)|
|title       |varchar(30)     |-|
|beschr      |memo            |-|
|button_text |varchar(15)     |-|
|linkurl     |varchar(255)    |-|