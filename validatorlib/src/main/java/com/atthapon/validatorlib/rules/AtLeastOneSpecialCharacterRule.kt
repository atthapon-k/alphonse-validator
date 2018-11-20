package com.atthapon.validatorlib.rules

import com.atthapon.validatorlib.Validator
import com.atthapon.validatorlib.common.InitValidator

class AtLeastOneSpecialCharacterRule(var errorMsg: String = InitValidator.errorMessage.getAtLeastOneSpecialCharacter()):
    BaseRule {
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return !Validator(text).regex("[A-Za-z0-9]+").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}