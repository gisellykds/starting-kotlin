package FirstSpringKotlinApp.controllers

import FirstSpringKotlinApp.operations.Helper
import org.jetbrains.annotations.NotNull
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Validated
class CalculatorController(val helper: Helper) {

    @GetMapping("operation/{type}")
    fun getSub(
        @NotNull @PathVariable("type") type: TypeOperation,
        @NotNull @RequestParam("number1") x: Double,
        @NotNull @RequestParam("number2") y: Double
    ): Double {
        return helper.getTypeOperation(type, x, y)
    }

}

