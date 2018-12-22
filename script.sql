create table teacher
(
    id integer NOT NULL,
    first_name character varying(254),
    last_name character varying(254),
     primary key(id)
);

create table student(
    id_student integer NOT NULL,
    teacher_id integer NOT NULL,
    first_name character varying(254),
    last_name character varying(254),
    email character varying(254),
    primary key(id_student),
    foreign key(teacher_id) references teacher(id)
);


create table mark(
   id_mark integer NOT NULL,
    teacher_id integer NOT NULL,
    note character varying(254),
    primary key(id_mark),
    foreign key (teacher_id) references teacher(id)

);

create table book(
  id_book integer NOT NULL,
  teacher_id integer NOT NULL,
  type character varying(254),
    primary key(id_book),
    foreign key (teacher_id) references teacher(id)
);
create table orders(
  id_order integer NOT NULL,
  stud_id integer NOT NULL,
  nature character varying(254),
    primary key(id_order),
    foreign key (stud_id) references student(id_student)
);


