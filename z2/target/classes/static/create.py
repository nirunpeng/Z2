import random
from faker import Faker
import csv
import codecs

def create_data(num):

    # surname_list = ['戴维斯', '米勒', '加西亚', '罗德里格斯', '史密斯', '约翰逊', '威尔逊', '马丁内兹', '安德森', '泰勒', '威廉姆斯', '马丁', '杰克逊', '汤普森',
    #                 '怀特', '布朗', '琼斯', '托马斯', '克拉克', '刘易斯', '鲁宾逊', '沃克', '佩雷斯', '摩尔', '洛佩兹', '李', '冈萨雷斯', '霍尔', '赖特',
    #                 '金', '斯科特', '艾伦', '纳尔逊', '希尔']
    # name_list = ['艾布特', '希伯来', '埃布尔', '艾布纳', '亚伯拉罕', '亚岱尔', '亚当', '艾狄生', '奥德里奇', '亚尔弗列得', '阿尔杰', '奥斯顿', '阿尔文', '亚摩斯',
    #              '安得烈',
    #              '安格斯', '安托万', '安东尼', '阿诺', '艾文', '亚撒', '亚希伯恩', '亚特伍德', '奥古斯汀', '奥格斯格', '艾富里', '柏得温', '班克罗夫特', '巴德',
    #              '巴洛', '巴奈特']
    # position_player = ['G', 'F', 'C']
    # height_player = ['2.11米/6尺11', '1.98米/6尺6', '1.91米/6尺3', '2.03米/6尺8', '2.01米/6尺7', '1.88米/6尺2', '1.96米/6尺5', '2.18米/7尺2',
    #                  '2.06米/6尺9', '1.85米/6尺1', '1.93米/6尺4', '2.01米/6尺7', '2.08米/6尺10']
    # weight_player = ['120公斤/265磅', '98公斤/215磅', '79公斤/174磅', '110公斤/242磅', '84公斤/185磅', '113公斤/250磅', '105公斤/232磅', '88公斤/195磅',
    #                  '83公斤/183磅', '100公斤/220磅', '95公斤/210磅', '88公斤/193磅']
    datalist = []
    data = []
    names = []
    sanfens = []
    bans = []
    sorces = []
    toulangs = []
    qiangduans = []
    changcis = []
    gaimaos = []
    zhugons = []
    times = []
    salarys = []

    x = 50
    for i in range(num):

        f = Faker(locale="zh_CN")
        name = f.name()
        names.append(name)
        # print(names)



        sanfen = '{:.1%}'.format(random.uniform(0.0, 0.5))
        sanfens.append(sanfen)
        # print(num)


        # for s in range(random.randint(1, 2)):
        ban = '{:.1f}'.format(random.uniform(0, 10))
        bans.append(ban)
        # print(position)


        sorce = random.randint(0, 30)
        sorces.append(sorce)


        toulang = '{:.1%}'.format(random.uniform(0, 0.6))
        toulangs.append(toulang)


        qiangduan = '{:.2f}'.format(random.uniform(0, 1.20))
        qiangduans.append(qiangduan)


        changci = random.randint(0, 75)
        changcis.append(changci)


        gaimao = '{:.2f}'.format(random.uniform(0, 1.0))
        gaimaos.append(gaimao)


        zhugon = '{:.1f}'.format(random.uniform(0, 7.0))
        zhugons.append(zhugon)


        time = '{:.1f}'.format(random.uniform(0, 34.0))
        times.append(time)


        for i in range(0, int(num*x*0.01)):
            salary = random.randint(50, 1000)
            salarys.append(salary)
        for i in range(0, int(num*(100 - x)*0.01)):
            salary = random.randint(1000, 5000)
            salarys.append(salary)
        # print(salary)
        # sala = []
        # sa = []
        #
        # for str1 in salarys:
        #     str2 = str1.split('：')[1]
        #     money = str2.replace('万美元', '')
        #     sala.append(money)
        # for str4 in sala:
        #     if str4 == '':
        #         str4 = '0'
        #     sa.append(str4)
    data.append(names)
    data.append(sanfens)
    data.append(bans)
    data.append(sorces)
    data.append(toulangs)
    data.append(qiangduans)
    data.append(changcis)
    data.append(gaimaos)
    data.append(zhugons)
    data.append(times)
    data.append(salarys)

    for d in range(len(data[0])):
        l = []
        for s in range(len(data)):
            l.append(data[s][d])
        datalist.append(l)  # 把处理好的信息放入datalist


    with codecs.open('./nba.csv', 'w', 'utf-8') as csvfile:
        # 指定 csv 文件的头部显示项
        filednames = ['姓名', '三分命中率', '篮板', '得分', '投篮命中率', '抢断', '场次', '盖帽', '助攻', '场均时长', '薪资']
        writer = csv.DictWriter(csvfile, fieldnames=filednames)
        writer.writeheader()
        for i in range(0, len(data[0])):
            try:
                writer.writerow({'姓名': data[0][i], '三分命中率': data[1][i], '篮板': data[2][i], '得分': data[3][i],
                                 '投篮命中率': data[4][i], '抢断': data[5][i], '场次': data[6][i], '盖帽': data[7][i],
                                 '助攻': data[8][i], '场均时长': data[9][i], '薪资': data[10][i]})
            except UnicodeEncodeError:
                print("编码错误, 该数据无法写到文件中, 直接忽略该数据")



    # man = len(data[0]) - len(data[3])
    # for y in range(man):
    #     num = random.randint(0, 99)
    #     data[3].append(num)
    #
    # for d in range(len(data[0])):
    #     l = []
    #     for s in range(len(data)):
    #         l.append(data[s][d])
    #     datalist.append(l)  # 把处理好的信息放入datalist


create_data(100)






