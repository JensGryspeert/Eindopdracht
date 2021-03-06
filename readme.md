# DB Opmaak #
## Entiteiten ##
1.  Users
2.  Event_Detail
3.  Agenda
4.  Events_Registered
5.  Tags

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
|tag_id      |int                 |-|
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
|user_id     |int                 |index(Users->id|
|agenda_id   |int                 |index(Agenda->id)|
|created_at  |datetime            |NOW()|
|updated_at  |datetime            |NOW()-->method update|

### Agenda ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id                  |int                 |autoinc(PK)|
|event_detail_id     |int                 |index(event_detail->id)|
|beg_uur             |unixstamp           |-|
|eind_uur            |unixstamp           |-|
|topic               |varchar(30)         |-|
|omschr              |memo                |-|
|created_at          |datetime            |NOW()|
|updated_at          |datetime            |NOW()-->method update|

### Events_Registered ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int     |autoinc(PK)|
|max_aant    |int     |-|
|event_id    |int     |index(Event_detail ->id)|
|agenda_id   |int     |index(agenda->id)
|user_id     |int     |index(Users->id)|

### Tags ###
|COLUMN      |TYPE            |Index|
|------------|----------------|-----|
|id          |int     |autoinc(PK)|
|title       |String  |-|