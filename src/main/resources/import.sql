-- Insert students
INSERT INTO student (id, name) VALUES (1, 'Alice');
INSERT INTO student (id, name) VALUES (2, 'Bob');
INSERT INTO student (id, name) VALUES (3, 'Charlie');

-- Insert courses
INSERT INTO course (id, title) VALUES (1, 'Math');
INSERT INTO course (id, title) VALUES (2, 'Science');
INSERT INTO course (id, title) VALUES (3, 'History');

-- Insert enrollments (Join records)
INSERT INTO enrollment (id, student_id, course_id) VALUES (1, 1, 1); -- Alice -> Math
INSERT INTO enrollment (id, student_id, course_id) VALUES (2, 2, 2); -- Bob -> Science
-- Charlie is not enrolled in any course
-- Course 3 (History) has no enrolled students