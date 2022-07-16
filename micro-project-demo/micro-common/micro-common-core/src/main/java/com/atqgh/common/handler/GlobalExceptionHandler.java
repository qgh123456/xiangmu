package com.atqgh.common.handler;

import com.atqgh.common.enums.ResultCodeEnum;
import com.atqgh.common.utils.ResultObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理.
 * @author Mubai
 * @date 2022/7/11 7:15 上午
 **/
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理sql异常.
     * @param e 异常
     * @return 结果
     */
    @ExceptionHandler(BadSqlGrammarException.class)
    public ResultObj error(BadSqlGrammarException e) {
        log.error(e.getMessage());
        return ResultObj.error(ResultCodeEnum.BAD_SQL_GRAMMAR.getCode(), ResultCodeEnum.BAD_SQL_GRAMMAR.getMessage());
    }
}
