ALTER TABLE Reservation ADD FOREIGN KEY (board) REFERENCES Board(id);
ALTER TABLE Reservation ADD FOREIGN KEY (sail) REFERENCES Sail(id);
ALTER TABLE Reservation ADD FOREIGN KEY (customer) REFERENCES Customer(id);

INSERT INTO Board VALUES(1, 'Naish', 'Starship', 120);
INSERT INTO Board VALUES(2, 'Naish', 'Galaxy', 130);
INSERT INTO Board VALUES(3, 'Fanatic', 'Freewave', 130);
INSERT INTO Board VALUES(4, 'Fanatic', 'Gecko', 145);

INSERT INTO Sail VALUES(1, 'Naish', 'Lift', 5);
INSERT INTO Sail VALUES(2, 'Naish', 'Force', 6.5);
INSERT INTO Sail VALUES(3, 'Mistral', 'Zonda', 4.5);
INSERT INTO Sail VALUES(4, 'Mistral', 'Zonda', 4.0);

INSERT INTO Customer VALUES (1, 'Samuel', 'Felipe');
INSERT INTO Customer VALUES (2, 'Robin', 'Kieler');
INSERT INTO Customer VALUES (3, 'Regina', 'Arnold');

INSERT INTO Reservation VALUES (1, '2021-08-20', 1, 1, 3);
