fun main() {
        for (i in 1..3) {
            if (i == 1)
                continue
            print(1)
            loop@ for (j in 1..2) {
                for (k in 1..2) {
                    if (i == 2 || j == 3) break@loop
                    print(2)
                }
                if (j == 1) return
                print(3)
            }
        }
}