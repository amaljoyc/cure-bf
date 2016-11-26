CREATE TABLE block
(
    id bigint NOT NULL,
    name varchar(255),
    CONSTRAINT pk_block PRIMARY KEY (id)
);

CREATE TABLE flow
(
    id bigint NOT NULL,
    name varchar(255),
    first_page_id bigint,
    block_id bigint,
    CONSTRAINT pk_flow PRIMARY KEY (id),
    CONSTRAINT fk_block FOREIGN KEY (block_id) REFERENCES block(id)
);

CREATE TABLE page
(
    id bigint NOT NULL,
    name varchar(255),
    state varchar(255),
    view text,
    previous_page_id bigint,
    flow_id bigint,
    CONSTRAINT pk_page PRIMARY KEY (id),
    CONSTRAINT fk_flow FOREIGN KEY (flow_id) REFERENCES flow(id)
);

CREATE TABLE next_pages
(
	page_id bigint NOT NULL,
	next_page_id bigint NOT NULL,
	CONSTRAINT fk_page FOREIGN KEY (page_id) REFERENCES page(id)
);