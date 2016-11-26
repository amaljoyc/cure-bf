INSERT INTO block (id, name) VALUES (1, 'DOC');
INSERT INTO block (id, name) VALUES (2, 'IDENT');
INSERT INTO block (id, name) VALUES (3, 'SIGN');
INSERT INTO block (id, name) VALUES (4, 'PAY');


INSERT INTO flow (id, name, first_page_id, block_id) VALUES (1, 'OFF_ONLY', 1, 1);
INSERT INTO flow (id, name, first_page_id, block_id) VALUES (2, 'MIXED', 4, 1);

INSERT INTO flow (id, name, first_page_id, block_id) VALUES (3, 'OFF_ONLY', 11, 2);
INSERT INTO flow (id, name, first_page_id, block_id) VALUES (4, 'MIXED', 15, 2);

INSERT INTO flow (id, name, first_page_id, block_id) VALUES (5, 'OFF_ONLY', 23, 3);

INSERT INTO flow (id, name, first_page_id, block_id) VALUES (6, 'OFF_ONLY', 30, 4);


INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (1, 'doc_off_only', null, '{}', null, 1);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (2, 'doc_off_only_confirm', null, '{}', 1, 1);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (3, 'doc_off_only_success', null, '{}', 2, 1);
	
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (4, 'doc_mixed_decision', null, '{}', null, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (5, 'doc_offline', 'OFFLINE', '{}', 4, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (6, 'doc_online', 'ONLINE', '{}', 4, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (7, 'doc_offline_confirm', null, '{}', 5, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (8, 'doc_online_confirm', null, '{}', 6, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (9, 'doc_offline_success', null, '{}', 7, 2);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (10, 'doc_online_success', null, '{}', 8, 2);
	
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (11, 'ident_off_only_locked', null, '{}', null, 3);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (12, 'ident_off_only', null, '{}', 11, 3);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (13, 'ident_off_only_confirm', null, '{}', 12, 3);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (14, 'ident_off_only_success', null, '{}', 13, 3);
	
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (15, 'ident_mixed_locked', null, '{}', null, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (16, 'ident_mixed_decision', null, '{}', 15, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (17, 'ident_offline', 'OFFLINE', '{}', 16, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (18, 'ident_online', 'ONLINE', '{}', 16, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (19, 'ident_offline_confirm', null, '{}', 17, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (20, 'ident_online_confirm', null, '{}', 18, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (21, 'ident_offline_success', null, '{}', 19, 4);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (22, 'ident_online_success', null, '{}', 20, 4);

INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (23, 'sign_offline_locked', null, '{}', null, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (24, 'sign_offline_single', 'SINGLE', '{}', 23, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (25, 'sign_offline_multiple', 'MULTIPLE', '{}', 23, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (26, 'sign_offline_single_confirm', null, '{}', 24, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (27, 'sign_offline_multiple_confirm', null, '{}', 25, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (28, 'sign_offline_single_success', null, '{}', 26, 5);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (29, 'sign_offline_multiple_success', null, '{}', 27, 5);

INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (30, 'pay_locked', null, '{}', null, 6);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (31, 'pay_confirm', null, '{}', 30, 6);
INSERT INTO page (id, name, state, view, previous_page_id, flow_id) 
	VALUES (32, 'pay_success', null, '{}', 31, 6);

	
INSERT INTO next_pages (page_id, next_page_id) VALUES (1, 2);
INSERT INTO next_pages (page_id, next_page_id) VALUES (2, 3);
INSERT INTO next_pages (page_id, next_page_id) VALUES (4, 5);
INSERT INTO next_pages (page_id, next_page_id) VALUES (4, 6);
INSERT INTO next_pages (page_id, next_page_id) VALUES (5, 7);
INSERT INTO next_pages (page_id, next_page_id) VALUES (7, 9);
INSERT INTO next_pages (page_id, next_page_id) VALUES (6, 8);
INSERT INTO next_pages (page_id, next_page_id) VALUES (8, 10);
INSERT INTO next_pages (page_id, next_page_id) VALUES (11, 12);
INSERT INTO next_pages (page_id, next_page_id) VALUES (12, 13);
INSERT INTO next_pages (page_id, next_page_id) VALUES (13, 14);
INSERT INTO next_pages (page_id, next_page_id) VALUES (15, 16);
INSERT INTO next_pages (page_id, next_page_id) VALUES (16, 17);
INSERT INTO next_pages (page_id, next_page_id) VALUES (16, 18);
INSERT INTO next_pages (page_id, next_page_id) VALUES (17, 19);
INSERT INTO next_pages (page_id, next_page_id) VALUES (19, 21);
INSERT INTO next_pages (page_id, next_page_id) VALUES (18, 20);
INSERT INTO next_pages (page_id, next_page_id) VALUES (20, 22);
INSERT INTO next_pages (page_id, next_page_id) VALUES (23, 24);
INSERT INTO next_pages (page_id, next_page_id) VALUES (23, 25);
INSERT INTO next_pages (page_id, next_page_id) VALUES (24, 26);
INSERT INTO next_pages (page_id, next_page_id) VALUES (26, 28);
INSERT INTO next_pages (page_id, next_page_id) VALUES (25, 27);
INSERT INTO next_pages (page_id, next_page_id) VALUES (27, 29);
INSERT INTO next_pages (page_id, next_page_id) VALUES (30, 31);
INSERT INTO next_pages (page_id, next_page_id) VALUES (31, 32);
