create table MOVIE_INFO
(
    COLLECT_TIME  varchar(16)                          not null,
    SEQ           int      default 0                   not null,
    MOVIE_RANK    int                                  null,
    MOVIE_NM      varchar(100)                         null,
    MOVIE_RESERVE varchar(100)                         null,
    SCORE         varchar(16)                          null,
    OPEN_DAY      varchar(16)                          null,
    REG_ID        varchar(16)                          null,
    REG_DT        datetime default current_timestamp() null,
    CHG_ID        varchar(16)                          null,
    CHG_DT        datetime default current_timestamp() null,
    primary key (COLLECT_TIME, SEQ)
)
    comment 'CGV 정보';

