DESCRIBE user_info;

INSERT INTO user_info (STUDENT_NO, USER_ID) VALUES (1, 'KYM');

INSERT  INTO user_info (student_no, user_id, user_pw, first_name, last_name, create_ymd, update_ymd)
        VALUES (6, 'AHE', '1111', 'HYOEUN', 'AHN', '2020/06/20', '2020/06/20');

SELECT * FROM user_info;

ROLLBACK;

COMMIT;

--INSERT 삽입
INSERT INTO user_info values (6 , 'user_id' , 'user_pw' , 'first_name' , 'last_name' , sysdate , sysdate);

--CRUD 중에 User UPDATE
--UPDATE 쿼리를 이용해서 내가 등록한 USER_INFO를 수정해보기
--UPDATE TABLE_NAME SET COL_NAME = '여기에 넣을값'
--WHERE COL = '조건';
UPDATE user_info SET user_pw = '100' --first_name = 'HYOEUN'
WHERE student_no = 6 AND user_id = 'AHE';

--DELETE 삭제
DELETE user_info WHERE student_no = 6;

--로그인 처리를 위한 쿼리를 작성하시오. (USER_INFO 테이블 이용)
--예) 사용자가 girok 아이디 입력, 1212 비밀번호 입력 → 로그인 됨.
-- 그 외에 아이디 girok 아이디 입력, 1111 비밀번호 입력 → 로그인 실패됨.
SELECT *
FROM user_info
WHERE user_id = 'girok'
AND user_pw = '1212';



