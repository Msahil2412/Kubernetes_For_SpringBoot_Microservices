create table if not exists `accounts` (
    `cuostomer_id` int auto_increment primary key,
    `customer_name` varchar(255) not null,
    `customer_email` varchar(255) not null,
    `customer_phone` varchar(20) not null,
    `created_at` datetime not null default current_timestamp,
    `created_by` varchar(30) not null,
    `updated_at` datetime not null default current_timestamp on update current_timestamp,
    `updated_by` varchar(30) not null
);

create table if not exists `account_roles` (
    `customer_id` int not null,
    `account_number` int auto_increment primary key,
    `account_type` varchar(100) not null,
    `branch_address` varchar(255) not null,
    `created_at` datetime not null default current_timestamp,
    `created_by` varchar(30) not null,
    `updated_at` datetime not null default current_timestamp on update current_timestamp,
    `updated_by` varchar(30) not null
);