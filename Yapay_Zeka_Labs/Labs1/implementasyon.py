import random

class GridWorld:
    def __init__(self, size): # kare grid yapisini olusturur ve terminale basar.
        self.size = size
        self.grid = [['_' for i in range(size)] for i in range (size)]
        self.start = (0,0)
        self.goal = (size-1, size-1)
        self.pits = [tuple(random.randrange(size) for i in range(2)) for j in range(3)] # tuzaklar.

        self.grid[self.goal[0]][self.goal[1]] = 'G'
        for px,py in self.pits:
            self.grid[px][py] = "P"

        for i in self.grid:  
            for j in i:
                print(j, end=" ")
            print()

    def get_valid_moves(self, current_pos): # ajanin gidebilecegi yonleri dict olarak verir
        x,y = current_pos 
        all_moves = {"yukari": (x-1,y), "assagi": (x+1,y), "saga" : (x, y+1), "sola": (x, y-1)}
        valid_moves = {}
        for direction, (nx,ny) in all_moves.items():
            if 0 <= nx < self.size and 0 <= ny < self.size and self.grid[nx][ny] != 'P':
                valid_moves[direction] = (nx,ny)
        return valid_moves         

    def agent_simulasyon(self, agent_type, trials):  #terminale ilgi ajanin performansini basar

        # self = GridWorld(size)

        total_score = 0
        total_steps = 0
        success_count = 0
        
        for _ in range(trials):
            current_pos = self.start
            score = 0
            steps = 0
            memory = set()

            #her bir deneme icin ajanin atacagi max step 50 dir.
            #her bir denemede ajan metrikleri sifirlanip yeniden olculur ve en son toplam deneme sayisina bolunur.
            
            while steps < 50: # Sonsuz döngü önlemi
                if current_pos == self.goal:
                    score += 100
                    success_count += 1
                    break
                valid_moves = self.get_valid_moves(current_pos)
                if not valid_moves:
                    break 

                if agent_type == 'Reflex':
                    action = random.choice(list(valid_moves.keys()))
                    current_pos = valid_moves[action]

                elif agent_type == 'Model-Based': # modelin gectigi pozisyonlari memory'e ekler. 
                    memory.add(current_pos)
                    unvisited = {a: p for a, p in valid_moves.items() if p not in memory}  #volid_moves'dan memory cikartilir. 
                    if unvisited:
                        action = random.choice(list(unvisited.keys()))
                        current_pos = unvisited[action]
                    else: # gectigi yollar ajanin hareketini engelliyorsa valid_moves'dan secim yapilir.
                        action = random.choice(list(valid_moves.keys()))
                        current_pos = valid_moves[action]
                
                score -= 1
                steps += 1  

            total_score += score
            total_steps += steps

        ort_steps= total_steps / trials
        ort_score = total_score / trials
        ort_success = (success_count / trials) * 100

        print(f"{agent_type}'nin ort adim: {ort_steps}, ort puan: {ort_score}, basari orani: {ort_success}")

    
if __name__ == "__main__":
    env = GridWorld(5)
    env2 = GridWorld(10)
    while True:  # ajan tipi secilir.
        agent_type = input("ajan tipi belirle: Reflex / Model-Based ?")
        if agent_type == "Reflex" or agent_type == "Model-Based":
            break  
        else:
            print("eksik ya da yanlis secim yaptin, tekrar sec.")
        
    env.agent_simulasyon(agent_type,20)
    env2.agent_simulasyon(agent_type,20)
