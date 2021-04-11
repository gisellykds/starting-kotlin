package FirstSpringKotlinApp.operations

import FirstSpringKotlinApp.controllers.TypeOperation
import lombok.Getter
import org.springframework.stereotype.Component

@Getter
@Component
class Helper(
    val sumOperation: SumOperation, val subOperation: SubOperation,
    val divOperation: DivOperation, val multOperation: MultOperation
) {

    fun getTypeOperation(type: TypeOperation, x: Double, y: Double): Double {
        return when (type) {
            TypeOperation.SUM -> sumOperation.execute(x, y)
            TypeOperation.SUB -> subOperation.execute(x, y)
            TypeOperation.DIV -> divOperation.execute(x, y)
            TypeOperation.MULT -> multOperation.execute(x, y)
        }
    }

}