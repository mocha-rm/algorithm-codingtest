SELECT concat('/home/grep/src/', file.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) as "FILE_PATH"
FROM USED_GOODS_FILE file left join USED_GOODS_BOARD board on file.BOARD_ID = board.BOARD_ID
WHERE VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC

