create schema if not exists finansys_user;

create table finansys_user.user(
    id bigint primary key,
    created_at timestamp not null,
    updated_at timestamp null,
    deleted_at timestamp null,
    name varchar(100) not null,
    email varchar(100) not null
);