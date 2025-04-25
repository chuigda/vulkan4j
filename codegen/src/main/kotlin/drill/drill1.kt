package drill

import buildDoc
import render

fun main() {
    val d = buildDoc {
        +"abcd"
        +"efgh"

        nl()

        indent {
            +"ijk"

            nl()

            indent {
                +"def"
                +"ghi"
                +"jkl"
            }

            nl()

            +"cxk"
        }
    }

    print(render(d))
}
