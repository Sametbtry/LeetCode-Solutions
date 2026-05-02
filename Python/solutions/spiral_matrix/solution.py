from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]: 
        ordered = []

        l, r, b, t = 0, len(matrix[0]), len(matrix), 0

        while len(ordered) < len(matrix[0]) * len(matrix):
            for i in range(l, r):
                ordered.append(matrix[t][i])
            t += 1

            for i in range(t, b):
                ordered.append(matrix[i][r-1])
            r -= 1
            
            if l >= r or t >= b:
                break
            
            for i in range(r-1, l-1 ,-1):
                ordered.append(matrix[b-1][i])
            b -= 1

            for i in range(b-1, t-1, -1):
                ordered.append(matrix[i][l])
            l += 1

        return ordered
    
    def spiralOrder2(self, matrix: List[List[int]]) -> List[int]:
        rows, cols = len(matrix), len(matrix[0])
        x, y, dx, dy = 0, 0, 1, 0
        res = []

        for _ in range(rows * cols):
            res.append(matrix[y][x])
            matrix[y][x] = "." #type: ignore

            if not 0 <= x + dx < cols or not 0 <= y + dy < rows or matrix[y+dy][x+dx] == ".":
                dx, dy = -dy, dx
            
            x += dx
            y += dy
        
        return res

S1 = Solution()
answer = S1.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])
print(answer)
 
''' def spiralOrder
Zaman Karmaşıklığı (Time Complexity): O(m * n)

Burada m satır sayısını, n ise sütun sayısını ifade eder. Matristeki her bir elemanı tam olarak bir kez ziyaret edip listeye ekliyorsun. İşlem sayısı doğrudan matrisin toplam eleman sayısına (m * n) eşit olduğu için zaman karmaşıklığı doğrusal olarak buna bağlıdır.

Alan Karmaşıklığı (Space Complexity): O(1) (Ekstra alan / Auxiliary Space)

Sınırları ve döngüleri takip etmek için bellekte sadece birkaç adet sabit değişken (l, r, b, t, i) tutuyorsun. Matrisin boyutu 10x10 da olsa, 1000x1000 de olsa algoritmik mantığını işletmek için ihtiyaç duyduğun bu ekstra hafıza değişmez ve sabit kalır.

Önemli Not: Algoritma sorusunun doğası gereği zaten m * n boyutunda bir ordered dizisi döndürmek zorundasın. Mülakatlarda ve genel analizlerde çıktı dizisi ekstra alan hesabına dahil edilmez. Eğer o da hesaba katılırsa toplam alan karmaşıklığı O(m * n) olur, ancak genel kabul gören doğru cevap ekstra hafızanın O(1) olduğudur.
'''

'''def spiralOrder2
Zaman Karmaşıklığı (Time Complexity): O(m * n)

Kod, for _ in range(rows * cols): satırıyla matristeki toplam eleman sayısı (m satır ve n sütun) kadar net bir döngü çalıştırır. Döngü içerisindeki eleman okuma, atama yapma ve yön kontrolü gibi işlemler sabit zamanda yani O(1)'de gerçekleşir. Bu yüzden toplam çalışma süresi matrisin boyutuyla doğrusal olarak artar.

Alan Karmaşıklığı (Space Complexity): O(1) (Ekstra Alan / Auxiliary Space)

Algoritmanın asıl numarası buradadır. Hangi hücrelerin ziyaret edildiğini aklında tutmak için orijinal matrisle aynı boyutta ekstra bir visited (ziyaret edildi) matrisi oluşturmaz. Bunun yerine girdi matrisini tahrip ederek (sayıların yerine . koyarak) yerinde (in-place) işaretleme yapar.

Bellekte sadece koordinat ve yön bilgilerini tutan dört adet tam sayı değişkeni (x, y, dx, dy) saklanır. Mülakat standartlarında geri döndürülen çıktı dizisi (res) ekstra alan maliyetine dahil edilmediği için alan karmaşıklığı sabittir.
'''
'''
Artısı: Kodu son derece kısa ve zekicedir. Sınır daraltma matematiğinden kurtarır.

Eksisi: Orijinal girdi matrisini kalıcı olarak değiştirir (sayıları söküp yerine nokta koyar). Yazılım mühendisliği prensiplerinde ve teknik mülakatlarda, girdi parametresini bu şekilde tahrip etmek (mutate) çoğu zaman hoş karşılanmaz ve kötü bir pratik olarak değerlendirilir.
'''
