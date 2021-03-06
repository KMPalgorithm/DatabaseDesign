USE [DatabaseDesignVersion2]
GO
/****** Object:  Table [dbo].[User]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[User](
	[UID] [char](10) NOT NULL,
	[UN] [varchar](20) NOT NULL,
	[PWD] [varchar](20) NOT NULL,
	[PN] [varchar](15) NULL,
	[Email] [varchar](30) NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[User] ([UID], [UN], [PWD], [PN], [Email]) VALUES (N'1         ', N'dzh', N'123456', N'12345678910', N'821523850@qq.com')
INSERT [dbo].[User] ([UID], [UN], [PWD], [PN], [Email]) VALUES (N'2         ', N'wj', N'123456', N'13123412434', N'123412341234')
INSERT [dbo].[User] ([UID], [UN], [PWD], [PN], [Email]) VALUES (N'3         ', N'lc', N'123456', N'21341234123', N'234as123`213`')
INSERT [dbo].[User] ([UID], [UN], [PWD], [PN], [Email]) VALUES (N'4         ', N'zty', N'123456', N'23452344422', N'23452twde45')
/****** Object:  Table [dbo].[Tag]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tag](
	[TID] [char](10) NOT NULL,
	[TN] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Tag_1] PRIMARY KEY CLUSTERED 
(
	[TID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'1         ', N'人性')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'2         ', N'美国')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'3         ', N'2019')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'4         ', N'社会')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'5         ', N'中国大陆')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'6         ', N'韩国')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'7         ', N'悬疑')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'8         ', N'戛纳')
INSERT [dbo].[Tag] ([TID], [TN]) VALUES (N'9         ', N'剧情')
/****** Object:  Table [dbo].[Stuff]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Stuff](
	[SID] [char](10) NOT NULL,
	[SN] [nvarchar](50) NOT NULL,
	[Sex] [nchar](1) NULL,
	[BDate] [date] NULL,
	[BP] [nvarchar](20) NULL,
	[Voca] [nvarchar](30) NULL,
	[MN] [nvarchar](30) NULL,
	[SIntro] [ntext] NULL,
	[SPic] [varchar](255) NULL,
 CONSTRAINT [PK_Stuff] PRIMARY KEY CLUSTERED 
(
	[SID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Stuff] ([SID], [SN], [Sex], [BDate], [BP], [Voca], [MN], [SIntro], [SPic]) VALUES (N'1036390   ', N'托德·菲利普斯 Todd Phillips', N'男', CAST(0x9BFA0A00 AS Date), N'美国,纽约,布鲁克林', N'制片人 / 导演 / 编剧 / 演员', N'Todd Bunzl (本名)', N'托德·菲利普斯，好莱坞著名导演，以性喜剧《宿醉》成名。', N'https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12855.webp')
INSERT [dbo].[Stuff] ([SID], [SN], [Sex], [BDate], [BP], [Voca], [MN], [SIntro], [SPic]) VALUES (N'1045427   ', N'塞米·鲍亚吉拉 Sami Bouajila', N'男', CAST(0x08F40A00 AS Date), N'法国,伊泽尔省,Échirolles', N'演员', N'萨米·布阿吉拉', N'获得了法国国家优秀贡献奖， 此奖仅次于“法兰西荣誉军团勋章”', N'https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16864.webp')
INSERT [dbo].[Stuff] ([SID], [SN], [Sex], [BDate], [BP], [Voca], [MN], [SIntro], [SPic]) VALUES (N'1062919   ', N'奉俊昊 Joon-ho Bong', N'男', CAST(0xCDF80A00 AS Date), N'韩国,大邱,广域市', N'导演 / 编剧 / 演员 / 制片人 / 剪辑', N'봉준호/ Pong Chunho / Bong Jun-ho', N'奉俊昊1993年毕业于延世大学社会学专业。处女作是短片《白色人》，但人们通常都把《绑架门口狗》作为他的处女作，实在是本片太过于出色。奉俊昊虽然属于一鸣惊人的类型，但更是踏踏实实的实干型导演，他凭借着过人的才智和勤奋的工作态度使他能够拍摄出极具吸引力、极高的表现力的作品，令人刮目相看。2003年拍摄的《杀人记忆》为奉俊昊在电影界建立的极高地位，该片先后获得了第2届大韩民国电影奖最佳导演奖，第2届大韩民国电影奖最佳剧本/编剧奖，第16届东京电影节亚洲最佳电影奖，第40届大钟奖最佳导演奖，第51届圣巴塞斯蒂安国际电影节新人导演奖和FIPRESCI奖以及釜山电影评论联合会。最佳剧本奖。2003年的大丰收可见其作品的流行度之广，由此引发的韩国2003年的剧本热也让人津津乐道。', N'https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1388466418.95.webp')
INSERT [dbo].[Stuff] ([SID], [SN], [Sex], [BDate], [BP], [Voca], [MN], [SIntro], [SPic]) VALUES (N'1275934   ', N'王景春 Jingchun Wang ', N'男', CAST(0xACFD0A00 AS Date), N'中国,新疆,阿勒泰', N'演员 / 制片人', NULL, N'姓名：王景春 生 日： 2月12日', N'https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12560.webp')
/****** Object:  Table [dbo].[Film]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Film](
	[FID] [char](10) NOT NULL,
	[FN] [nvarchar](50) NULL,
	[TYPE] [nvarchar](30) NULL,
	[AREA] [nvarchar](20) NULL,
	[LNG] [nvarchar](20) NULL,
	[FT] [smallint] NULL,
	[ST] [date] NULL,
	[AN] [nvarchar](50) NULL,
	[INTRO] [ntext] NULL,
	[POS] [nvarchar](255) NULL,
 CONSTRAINT [PK_Film] PRIMARY KEY CLUSTERED 
(
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Film] ([FID], [FN], [TYPE], [AREA], [LNG], [FT], [ST], [AN], [INTRO], [POS]) VALUES (N'26715636  ', N'地久天长 (2019)', N'剧情 / 家庭', N'中国大陆', N'汉语普通话', 175, CAST(0x733F0B00 AS Date), N'So Long, My Son', N'　　影片讲述患难与共的两个家庭因为一场有隐情的意外被迫疏远，他们在时代洪流下历尽伤痛与不安，人生起伏跌宕，最终选择面对真相，坦荡向前的故事。 ', N'https://movie.douban.com/photos/photo/2547486747/')
INSERT [dbo].[Film] ([FID], [FN], [TYPE], [AREA], [LNG], [FT], [ST], [AN], [INTRO], [POS]) VALUES (N'27010768  ', N'寄生虫 기생충 (2019)', N'剧情 / 喜剧', N'韩国', N'韩语', 132, CAST(0xAF3F0B00 AS Date), N'寄生上流(台) / 上流寄生族(港) / 패러사이트/Parasite / Gisaengchung', N'　　基宇（崔宇植 饰）出生在一个贫穷的家庭之中，和妹妹基婷（朴素丹 饰）以及父母在狭窄的地下室里过着相依为命的日子。一天，基宇的同学上门拜访，他告诉基宇，自己在一个有钱人家里给他们的女儿做家教，太太是一个头脑简单出手又阔绰的女人，因为自己要出国留学，所以将家教的职位暂时转交给基宇。 ', N'https://movie.douban.com/photos/photo/2557391568/')
INSERT [dbo].[Film] ([FID], [FN], [TYPE], [AREA], [LNG], [FT], [ST], [AN], [INTRO], [POS]) VALUES (N'27119724  ', N'小丑 Joker', N'剧情 / 惊悚 / 犯罪', N'加拿大 / 美国', N'英语', 122, CAST(0x15400B00 AS Date), N'小丑起源电影：罗密欧 / Romeo / Joker Origin Movie', N'电影《小丑》以同名DC漫画角色为基础，由华纳兄弟影业公司发行，计划于2019年10月4日上映。本片的故事将独立于DCEU之外，故事背景设置在20世纪80年代，讲述了一位生活陷入困境的脱口秀喜剧演员渐渐走向精神的崩溃，在哥谭市开始了疯狂的犯罪生涯，最终成为了蝙蝠侠的宿敌“小丑”的故事。 ', N'https://movie.douban.com/photos/photo/2567198874/')
INSERT [dbo].[Film] ([FID], [FN], [TYPE], [AREA], [LNG], [FT], [ST], [AN], [INTRO], [POS]) VALUES (N'34679878  ', N'一个父亲的寻肝之路 Bik Eneich – Un Fils (2019)', N'剧情', N'突尼斯 / 法国 / 黎巴嫩 / 卡塔尔', N'阿拉伯语 / 法语', 96, CAST(0x15400B00 AS Date), N'比克·哈梅内伊：儿子 / 非一般家庭风暴(台) / A Son', N'费拉兹、梅里姆和他们十岁儿子阿齐兹在去往南部国家度假的途中遭遇枪战,儿子被子弹误伤。阿齐兹急需肝脏移植,这不仅将夫妻二人的生活完全打乱,而且揭开了一个埋藏许久的秘密。阿齐兹能活下来吗?费拉兹、梅里姆二人的夫妻关系又将如何呢?', N'https://movie.douban.com/photos/photo/2565015685/')
/****** Object:  Table [dbo].[FF]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FF](
	[UID] [char](10) NOT NULL,
	[FID] [char](10) NOT NULL,
 CONSTRAINT [PK_FF] PRIMARY KEY CLUSTERED 
(
	[UID] ASC,
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'1         ', N'26715636  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'1         ', N'27010768  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'1         ', N'34679878  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'2         ', N'26715636  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'2         ', N'27119724  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'3         ', N'27010768  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'3         ', N'34679878  ')
INSERT [dbo].[FF] ([UID], [FID]) VALUES (N'4         ', N'34679878  ')
/****** Object:  Table [dbo].[FeS]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FeS](
	[UID] [char](10) NOT NULL,
	[SID] [char](10) NOT NULL,
 CONSTRAINT [PK_FeS] PRIMARY KEY CLUSTERED 
(
	[UID] ASC,
	[SID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'1         ', N'1036390   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'1         ', N'1045427   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'2         ', N'1062919   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'3         ', N'1062919   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'4         ', N'1036390   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'4         ', N'1045427   ')
INSERT [dbo].[FeS] ([UID], [SID]) VALUES (N'4         ', N'1275934   ')
/****** Object:  Table [dbo].[Award]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Award](
	[AID] [char](10) NOT NULL,
	[AName] [nvarchar](50) NOT NULL,
	[AIntro] [ntext] NULL,
 CONSTRAINT [PK_Award] PRIMARY KEY CLUSTERED 
(
	[AID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'1         ', N'第76届威尼斯电影节', N'本届电影节于8月28日-9月7日举行。DC漫改电影《小丑》荣获最佳影片金狮奖，罗曼·波兰斯基新作《我控诉》获得评委会大奖；华语电影仅有杨凡导演的《继园台七号》获最佳剧本奖。')
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'2         ', N'第2届海南岛国际电影节', N'随着入围剧情长片的揭晓，“金椰奖”已初具雏形。看上去，一切都顺着时空的方向，线性有序地稳步推进着。然而，简单地以征片期、审片期，再到入围宣布的时间节点为单位，还远远无法衡量出充斥在这期间的角力力争之紧张和评审审议之专业。剧情长片共有13部影片突围，共同角逐“金椰奖”的最高荣誉。')
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'3         ', N'第72届戛纳电影节', NULL)
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'4         ', N'第40届韩国电影青龙奖', N'官方网站:  ')
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'5         ', N'第69届柏林国际电影节', NULL)
INSERT [dbo].[Award] ([AID], [AName], [AIntro]) VALUES (N'6         ', N'第32届中国电影金鸡奖', NULL)
/****** Object:  Table [dbo].[AType]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[AType](
	[ATID] [char](10) NOT NULL,
	[TName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_AType] PRIMARY KEY CLUSTERED 
(
	[ATID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'1         ', N'最佳男演员')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'2         ', N'最佳女演员')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'3         ', N'最佳配乐奖')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'4         ', N'最佳男配角')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'5         ', N'最佳女配角')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'6         ', N'主竞赛单元')
INSERT [dbo].[AType] ([ATID], [TName]) VALUES (N'7         ', N'最佳影片奖')
/****** Object:  Table [dbo].[FU]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FU](
	[UID] [char](10) NOT NULL,
	[FUID] [char](10) NOT NULL,
 CONSTRAINT [PK_FU] PRIMARY KEY CLUSTERED 
(
	[UID] ASC,
	[FUID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'1         ', N'2         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'1         ', N'3         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'1         ', N'4         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'2         ', N'1         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'2         ', N'4         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'3         ', N'4         ')
INSERT [dbo].[FU] ([UID], [FUID]) VALUES (N'4         ', N'3         ')
/****** Object:  Table [dbo].[LtoF]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LtoF](
	[LID] [char](10) NOT NULL,
	[FID] [char](10) NOT NULL,
 CONSTRAINT [PK_LtoF] PRIMARY KEY CLUSTERED 
(
	[LID] ASC,
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'1         ', N'26715636  ')
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'1         ', N'27119724  ')
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'1         ', N'34679878  ')
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'2         ', N'27010768  ')
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'2         ', N'27119724  ')
INSERT [dbo].[LtoF] ([LID], [FID]) VALUES (N'3         ', N'27010768  ')
/****** Object:  Table [dbo].[LikeList]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LikeList](
	[LID] [char](10) NOT NULL,
	[UID] [char](10) NOT NULL,
	[LN] [nvarchar](30) NOT NULL,
	[LIntro] [ntext] NULL,
	[LPic] [nchar](255) NULL,
 CONSTRAINT [PK_LikeList_1] PRIMARY KEY CLUSTERED 
(
	[LID] ASC,
	[UID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[LikeList] ([LID], [UID], [LN], [LIntro], [LPic]) VALUES (N'1         ', N'1         ', N'英文', N'英文电影', N'List1_URL                                                                                                                                                                                                                                                      ')
INSERT [dbo].[LikeList] ([LID], [UID], [LN], [LIntro], [LPic]) VALUES (N'2         ', N'2         ', N'悬疑', N'悬疑电影', N'List2_URL                                                                                                                                                                                                                                                      ')
INSERT [dbo].[LikeList] ([LID], [UID], [LN], [LIntro], [LPic]) VALUES (N'3         ', N'1         ', N'中文', N'中文电影', N'List3_URL                                                                                                                                                                                                                                                      ')
/****** Object:  Table [dbo].[FT]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FT](
	[FID] [char](10) NOT NULL,
	[TID] [char](10) NOT NULL,
	[TC] [int] NULL,
 CONSTRAINT [PK_FT] PRIMARY KEY CLUSTERED 
(
	[FID] ASC,
	[TID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FT] ([FID], [TID], [TC]) VALUES (N'26715636  ', N'5         ', 123)
INSERT [dbo].[FT] ([FID], [TID], [TC]) VALUES (N'27010768  ', N'6         ', 212)
INSERT [dbo].[FT] ([FID], [TID], [TC]) VALUES (N'27119724  ', N'3         ', 1000)
INSERT [dbo].[FT] ([FID], [TID], [TC]) VALUES (N'27119724  ', N'7         ', 21)
INSERT [dbo].[FT] ([FID], [TID], [TC]) VALUES (N'34679878  ', N'9         ', 1200)
/****** Object:  Table [dbo].[FS]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FS](
	[SID] [char](10) NOT NULL,
	[FID] [char](10) NOT NULL,
	[Voca] [nchar](10) NOT NULL,
 CONSTRAINT [PK_FS] PRIMARY KEY CLUSTERED 
(
	[SID] ASC,
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FS] ([SID], [FID], [Voca]) VALUES (N'1036390   ', N'27119724  ', N'制片人       ')
INSERT [dbo].[FS] ([SID], [FID], [Voca]) VALUES (N'1045427   ', N'26715636  ', N'演员        ')
INSERT [dbo].[FS] ([SID], [FID], [Voca]) VALUES (N'1062919   ', N'27010768  ', N'导演        ')
INSERT [dbo].[FS] ([SID], [FID], [Voca]) VALUES (N'1275934   ', N'26715636  ', N'演员        ')
/****** Object:  Table [dbo].[Evaluate]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Evaluate](
	[UID] [char](10) NOT NULL,
	[FID] [char](10) NOT NULL,
	[Score] [tinyint] NULL,
	[CMT] [ntext] NULL,
	[Status] [nchar](8) NULL,
	[UT] [nvarchar](max) NULL,
	[EDate] [smalldatetime] NOT NULL,
 CONSTRAINT [PK_Evaluate] PRIMARY KEY CLUSTERED 
(
	[UID] ASC,
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Evaluate] ([UID], [FID], [Score], [CMT], [Status], [UT], [EDate]) VALUES (N'1         ', N'27119724  ', 5, N'这才叫DC，谢谢。', N'看过      ', N'2019 美国 漫画改编 人性 ', CAST(0xAABA0000 AS SmallDateTime))
INSERT [dbo].[Evaluate] ([UID], [FID], [Score], [CMT], [Status], [UT], [EDate]) VALUES (N'2         ', N'26715636  ', 3, N'非常可惜，在这么好的一个故事中，对小孩成长的心理刻画完全缺失。那个背负着罪恶感的小孩将如何成长？那个顶替他人姓名的小孩将如何成长？影片只展现给观众一个看不到动因的结果（乖巧和叛逆）。荒谬的刻画又力度不够，跳舞入罪是一方面，那么遭到计生的下一代被鼓励多生又不提？如果说影片着重探讨的问题是失独家庭的希望在哪里，那么照影片给出的答案，就只有原谅和遗忘。剪辑是不必要的冗长，人物台词也失突兀，经常与身份不符（十分出戏），结局仍脱离不了"家和万事兴"的老套。唯一的坏人（还是大家都理解的时代悲剧造成的，职责所在！此处呼唤纽伦堡审判。。）已经遭到报应（此处狗血警告⚠️），可以皆大欢喜。未来的希望在哪里？大概是多一些男主这样想得开的英雄吧。', N'看过      ', N'柏林电影节 社会 人生 中国大陆 ', CAST(0xA9F60000 AS SmallDateTime))
INSERT [dbo].[Evaluate] ([UID], [FID], [Score], [CMT], [Status], [UT], [EDate]) VALUES (N'3         ', N'27010768  ', 4, N'我先来第一瓢凉水吧，富人的形象太简单了，富人很傻吗？😄', N'看过      ', N'人性 韩国 戛纳 悬疑 ', CAST(0xAA740000 AS SmallDateTime))
INSERT [dbo].[Evaluate] ([UID], [FID], [Score], [CMT], [Status], [UT], [EDate]) VALUES (N'4         ', N'34679878  ', 3, N'2019.11.28华语青年电影周电影展映 k11百方汇 中东电影，突尼斯导演处女作 电影真诚，导演用心，结尾开放，现实主义题材，2011年，战争背景，宗教，出轨，救子，看似套路的，都是有其母体的 国内发行人来映后 有人竟拿该片和《小偷家族》《何以为家》作比较 该片的原名应该是“儿子”', N'看过      ', N'突尼西亚 P-VeniceB入围逆流/地平线 电影就是要去电影院看 亲情 ', CAST(0xAB130000 AS SmallDateTime))
/****** Object:  Table [dbo].[Chat]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Chat](
	[FID] [char](10) NOT NULL,
	[ChatID] [char](10) NOT NULL,
	[UID] [char](10) NOT NULL,
	[Date] [smalldatetime] NOT NULL,
	[Title] [nvarchar](50) NOT NULL,
	[Cont] [ntext] NOT NULL,
	[LikeNum] [int] NOT NULL,
 CONSTRAINT [PK_Chat] PRIMARY KEY CLUSTERED 
(
	[ChatID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Chat] ([FID], [ChatID], [UID], [Date], [Title], [Cont], [LikeNum]) VALUES (N'27119724  ', N'1         ', N'1         ', CAST(0xAABA0000 AS SmallDateTime), N'别讨论小丑的三观了，小丑三观正还是小丑吗？', N'精华帖里已经有人准确的说出了整部电影就是小丑半真半假的笑话而已，你们还在讨论它三观有问题？他都承认他是神经病了你们还讨论什么呢？白耽误功夫，不如聊点真正有意思的', 0)
INSERT [dbo].[Chat] ([FID], [ChatID], [UID], [Date], [Title], [Cont], [LikeNum]) VALUES (N'27119724  ', N'2         ', N'2         ', CAST(0xAB12003C AS SmallDateTime), N'怎么看美国人动不动就欺负别人的这种街头现象？', N'观影全程没有任何代入感，不做过多评论，只感觉美国电影展现出来美国人动不动就欺负别人的这种街头现象，真的无法理解。', 0)
INSERT [dbo].[Chat] ([FID], [ChatID], [UID], [Date], [Title], [Cont], [LikeNum]) VALUES (N'26715636  ', N'3         ', N'3         ', CAST(0xAA1A046F AS SmallDateTime), N'为啥我对“海燕”痛恨不起来？', N'so long , my son (再见，儿子)。国师《活着》之后，先后出现了《蓝风筝》，《归来》，《芳华》……，王导这次把这后来的三十年的坑全给填了，填得很暴力，毫无保留。非线性叙事结构导演尽量避免走悲情路线，表面上是一个失独家庭的故事，但撕开这层伤疤却是这几十年国有体制改革和种种奇葩政策给无数小家庭带来的种种阵痛，无一例外的呈现在你眼前。海燕这个角色真是让人痛恨不起来，曾几何时，谁家村里，镇上，社区，没有一个计生办主任呢？最后那一句“咱有钱了，可以生了”，真是狠狠的给了某些组织一个耳光，直到现在，这个社会的信仰依旧是金钱至上，谈个屁的天长地久。', 0)
INSERT [dbo].[Chat] ([FID], [ChatID], [UID], [Date], [Title], [Cont], [LikeNum]) VALUES (N'27010768  ', N'4         ', N'4         ', CAST(0xAAA60253 AS SmallDateTime), N'最可怕的是，明明是讽刺穷人的电影，很多人还以为...', N'我终于知道这部电影为什么能得金棕榈了，因为评审团都是上流社会的人。', 0)
/****** Object:  Table [dbo].[Awards]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Awards](
	[AID] [char](10) NOT NULL,
	[ATID] [char](10) NOT NULL,
	[FID] [char](10) NULL,
	[SID] [char](10) NULL,
 CONSTRAINT [PK_Awards_1] PRIMARY KEY CLUSTERED 
(
	[AID] ASC,
	[ATID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'1         ', N'1         ', NULL, N'1045427   ')
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'1         ', N'6         ', N'27119724  ', NULL)
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'2         ', N'3         ', N'26715636  ', NULL)
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'2         ', N'7         ', N'34679878  ', NULL)
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'4         ', N'1         ', NULL, N'1062919   ')
INSERT [dbo].[Awards] ([AID], [ATID], [FID], [SID]) VALUES (N'4         ', N'7         ', N'27010768  ', NULL)
/****** Object:  Table [dbo].[Reply]    Script Date: 11/28/2019 20:12:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Reply](
	[RID] [char](10) NOT NULL,
	[ChatID] [char](10) NOT NULL,
	[UID] [char](10) NOT NULL,
	[Date] [smalldatetime] NOT NULL,
	[Cont] [ntext] NOT NULL,
	[LikeNum] [int] NULL,
 CONSTRAINT [PK_Reply] PRIMARY KEY CLUSTERED 
(
	[RID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Reply] ([RID], [ChatID], [UID], [Date], [Cont], [LikeNum]) VALUES (N'1         ', N'1         ', N'2         ', CAST(0xAB130497 AS SmallDateTime), N'喜欢这部电影在于小丑形象塑造真的太真实了！没有超强大脑，没有战斗值，没有深思熟虑，被自己情绪左右作决定。上节目表现出来的紧张，这就是普通人啊！', 0)
INSERT [dbo].[Reply] ([RID], [ChatID], [UID], [Date], [Cont], [LikeNum]) VALUES (N'2         ', N'1         ', N'2         ', CAST(0xAB040499 AS SmallDateTime), N'学会理解别人。', 0)
INSERT [dbo].[Reply] ([RID], [ChatID], [UID], [Date], [Cont], [LikeNum]) VALUES (N'3         ', N'2         ', N'1         ', CAST(0xAB04044B AS SmallDateTime), N'学电影拍摄手法就行了………………', 0)
INSERT [dbo].[Reply] ([RID], [ChatID], [UID], [Date], [Cont], [LikeNum]) VALUES (N'4         ', N'3         ', N'4         ', CAST(0xAB04043A AS SmallDateTime), N'反抗精神很值得学习，不过在我朝的话，还是收敛一点吧', 0)
INSERT [dbo].[Reply] ([RID], [ChatID], [UID], [Date], [Cont], [LikeNum]) VALUES (N'5         ', N'4         ', N'3         ', CAST(0xAB040461 AS SmallDateTime), N'努力向上，好好学习，提高层次，努力赚钱。', 0)
/****** Object:  Default [DF_Chat_LikeNum]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Chat] ADD  CONSTRAINT [DF_Chat_LikeNum]  DEFAULT ((0)) FOR [LikeNum]
GO
/****** Object:  Default [DF_Evaluate_Status]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Evaluate] ADD  CONSTRAINT [DF_Evaluate_Status]  DEFAULT ('看过') FOR [Status]
GO
/****** Object:  Default [DF_FS_Voca]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[FS] ADD  CONSTRAINT [DF_FS_Voca]  DEFAULT ((0)) FOR [Voca]
GO
/****** Object:  Default [DF_Reply_LikeNum]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Reply] ADD  CONSTRAINT [DF_Reply_LikeNum]  DEFAULT ((0)) FOR [LikeNum]
GO
/****** Object:  Default [DF_Stuff_Sex]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Stuff] ADD  CONSTRAINT [DF_Stuff_Sex]  DEFAULT ('男') FOR [Sex]
GO
/****** Object:  Check [CK_Evaluate]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [CK_Evaluate] CHECK  (([Status]='看过' OR [Status]='想看'))
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [CK_Evaluate]
GO
/****** Object:  Check [CK_Evaluate_1]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [CK_Evaluate_1] CHECK  (([Score]>=(0) AND [Score]<=(5)))
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [CK_Evaluate_1]
GO
/****** Object:  Check [CK_User]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [CK_User] CHECK  ((len([PWD])>(5)))
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [CK_User]
GO
/****** Object:  ForeignKey [FK_Awards_AType]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_AType] FOREIGN KEY([ATID])
REFERENCES [dbo].[AType] ([ATID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_AType]
GO
/****** Object:  ForeignKey [FK_Awards_Award]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Award] FOREIGN KEY([AID])
REFERENCES [dbo].[Award] ([AID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Award]
GO
/****** Object:  ForeignKey [FK_Awards_Film]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Film]
GO
/****** Object:  ForeignKey [FK_Awards_Stuff]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Stuff] FOREIGN KEY([SID])
REFERENCES [dbo].[Stuff] ([SID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Stuff]
GO
/****** Object:  ForeignKey [FK_Chat_Film]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Chat]  WITH CHECK ADD  CONSTRAINT [FK_Chat_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Chat] CHECK CONSTRAINT [FK_Chat_Film]
GO
/****** Object:  ForeignKey [FK_Chat_User]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Chat]  WITH CHECK ADD  CONSTRAINT [FK_Chat_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Chat] CHECK CONSTRAINT [FK_Chat_User]
GO
/****** Object:  ForeignKey [FK_Evaluate_Film]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [FK_Evaluate_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [FK_Evaluate_Film]
GO
/****** Object:  ForeignKey [FK_Evaluate_User]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [FK_Evaluate_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [FK_Evaluate_User]
GO
/****** Object:  ForeignKey [FK_FS_Film]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[FS]  WITH CHECK ADD  CONSTRAINT [FK_FS_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[FS] CHECK CONSTRAINT [FK_FS_Film]
GO
/****** Object:  ForeignKey [FK_FS_Stuff]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[FS]  WITH CHECK ADD  CONSTRAINT [FK_FS_Stuff] FOREIGN KEY([SID])
REFERENCES [dbo].[Stuff] ([SID])
GO
ALTER TABLE [dbo].[FS] CHECK CONSTRAINT [FK_FS_Stuff]
GO
/****** Object:  ForeignKey [FK_Film_FT]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[FT]  WITH CHECK ADD  CONSTRAINT [FK_Film_FT] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[FT] CHECK CONSTRAINT [FK_Film_FT]
GO
/****** Object:  ForeignKey [FK_FT_Tag]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[FT]  WITH CHECK ADD  CONSTRAINT [FK_FT_Tag] FOREIGN KEY([TID])
REFERENCES [dbo].[Tag] ([TID])
GO
ALTER TABLE [dbo].[FT] CHECK CONSTRAINT [FK_FT_Tag]
GO
/****** Object:  ForeignKey [FK_LikeList_User]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[LikeList]  WITH CHECK ADD  CONSTRAINT [FK_LikeList_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[LikeList] CHECK CONSTRAINT [FK_LikeList_User]
GO
/****** Object:  ForeignKey [FK_Reply_Chat]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Reply]  WITH CHECK ADD  CONSTRAINT [FK_Reply_Chat] FOREIGN KEY([ChatID])
REFERENCES [dbo].[Chat] ([ChatID])
GO
ALTER TABLE [dbo].[Reply] CHECK CONSTRAINT [FK_Reply_Chat]
GO
/****** Object:  ForeignKey [FK_Reply_User]    Script Date: 11/28/2019 20:12:11 ******/
ALTER TABLE [dbo].[Reply]  WITH CHECK ADD  CONSTRAINT [FK_Reply_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Reply] CHECK CONSTRAINT [FK_Reply_User]
GO
