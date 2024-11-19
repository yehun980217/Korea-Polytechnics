create table OCR_INFO
(
    SEQ            int                                  not null
        primary key,
    SAVE_FILE_NAME varchar(100)                         null,
    SAVE_FILE_PATH varchar(100)                         null,
    ORG_FILE_NAEM  varchar(100)                         null,
    EXT            varchar(10)                          null,
    OCR_TEXT       varchar(2000)                        null,
    REG_ID         varchar(16)                          null,
    REG_DT         datetime default current_timestamp() null,
    CHG_ID         varchar(16)                          null,
    CHG_DT         datetime default current_timestamp() null
);

