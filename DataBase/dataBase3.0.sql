USE [DatabaseDesignVersion3]
GO
/****** Object:  Table [dbo].[User]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[Tag]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[Stuff]    Script Date: 11/21/2019 14:46:40 ******/
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
	[Spic] [image] NULL,
 CONSTRAINT [PK_Stuff] PRIMARY KEY CLUSTERED 
(
	[SID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Film]    Script Date: 11/21/2019 14:46:40 ******/
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
	[ST] [timestamp] NULL,
	[AN] [nvarchar](50) NULL,
	[INTRO] [ntext] NULL,
	[POS] [image] NULL,
 CONSTRAINT [PK_Film] PRIMARY KEY CLUSTERED 
(
	[FID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FF]    Script Date: 11/21/2019 14:46:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FF](
	[UID] [char](10) NOT NULL,
	[FFID] [char](10) NOT NULL,
 CONSTRAINT [PK_FF] PRIMARY KEY CLUSTERED 
(
	[UID] ASC,
	[FFID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Award]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[AType]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[FU]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[LikeList]    Script Date: 11/21/2019 14:46:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LikeList](
	[LID] [char](10) NOT NULL,
	[UID] [char](10) NOT NULL,
	[FID] [char](10) NULL,
	[LN] [nvarchar](30) NOT NULL,
	[LIntro] [ntext] NULL,
	[LPic] [image] NULL,
 CONSTRAINT [PK_LikeList] PRIMARY KEY CLUSTERED 
(
	[LID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FT]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[FS]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[Evaluate]    Script Date: 11/21/2019 14:46:40 ******/
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
	[Status] [nchar](2) NULL,
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
/****** Object:  Table [dbo].[Chat]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[Awards]    Script Date: 11/21/2019 14:46:40 ******/
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
/****** Object:  Table [dbo].[Reply]    Script Date: 11/21/2019 14:46:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Reply](
	[ChatID] [char](10) NOT NULL,
	[UID] [char](10) NOT NULL,
	[Date] [smalldatetime] NOT NULL,
	[Cont] [ntext] NOT NULL,
	[LikeNum] [int] NULL,
 CONSTRAINT [PK_Reply] PRIMARY KEY CLUSTERED 
(
	[ChatID] ASC,
	[UID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF_Chat_LikeNum]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Chat] ADD  CONSTRAINT [DF_Chat_LikeNum]  DEFAULT ((0)) FOR [LikeNum]
GO
/****** Object:  Default [DF_Evaluate_Status]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Evaluate] ADD  CONSTRAINT [DF_Evaluate_Status]  DEFAULT ('看过') FOR [Status]
GO
/****** Object:  Default [DF_FS_Voca]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[FS] ADD  CONSTRAINT [DF_FS_Voca]  DEFAULT ((0)) FOR [Voca]
GO
/****** Object:  Default [DF_Reply_LikeNum]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Reply] ADD  CONSTRAINT [DF_Reply_LikeNum]  DEFAULT ((0)) FOR [LikeNum]
GO
/****** Object:  Default [DF_Stuff_Sex]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Stuff] ADD  CONSTRAINT [DF_Stuff_Sex]  DEFAULT ('男') FOR [Sex]
GO
/****** Object:  Check [CK_Evaluate]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [CK_Evaluate] CHECK  (([Status]='看过' OR [Status]='想看'))
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [CK_Evaluate]
GO
/****** Object:  Check [CK_Evaluate_1]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [CK_Evaluate_1] CHECK  (([Score]>=(5) AND [Score]<=(0)))
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [CK_Evaluate_1]
GO
/****** Object:  Check [CK_User]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [CK_User] CHECK  ((len([PWD])>(5)))
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [CK_User]
GO
/****** Object:  ForeignKey [FK_Awards_AType]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_AType] FOREIGN KEY([ATID])
REFERENCES [dbo].[AType] ([ATID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_AType]
GO
/****** Object:  ForeignKey [FK_Awards_Award]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Award] FOREIGN KEY([AID])
REFERENCES [dbo].[Award] ([AID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Award]
GO
/****** Object:  ForeignKey [FK_Awards_Film]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Film]
GO
/****** Object:  ForeignKey [FK_Awards_Stuff]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Awards]  WITH CHECK ADD  CONSTRAINT [FK_Awards_Stuff] FOREIGN KEY([SID])
REFERENCES [dbo].[Stuff] ([SID])
GO
ALTER TABLE [dbo].[Awards] CHECK CONSTRAINT [FK_Awards_Stuff]
GO
/****** Object:  ForeignKey [FK_Chat_Film]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Chat]  WITH CHECK ADD  CONSTRAINT [FK_Chat_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Chat] CHECK CONSTRAINT [FK_Chat_Film]
GO
/****** Object:  ForeignKey [FK_Chat_User]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Chat]  WITH CHECK ADD  CONSTRAINT [FK_Chat_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Chat] CHECK CONSTRAINT [FK_Chat_User]
GO
/****** Object:  ForeignKey [FK_Evaluate_Film]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [FK_Evaluate_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [FK_Evaluate_Film]
GO
/****** Object:  ForeignKey [FK_Evaluate_User]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Evaluate]  WITH CHECK ADD  CONSTRAINT [FK_Evaluate_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Evaluate] CHECK CONSTRAINT [FK_Evaluate_User]
GO
/****** Object:  ForeignKey [FK_FS_Film]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[FS]  WITH CHECK ADD  CONSTRAINT [FK_FS_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[FS] CHECK CONSTRAINT [FK_FS_Film]
GO
/****** Object:  ForeignKey [FK_FS_Stuff]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[FS]  WITH CHECK ADD  CONSTRAINT [FK_FS_Stuff] FOREIGN KEY([SID])
REFERENCES [dbo].[Stuff] ([SID])
GO
ALTER TABLE [dbo].[FS] CHECK CONSTRAINT [FK_FS_Stuff]
GO
/****** Object:  ForeignKey [FK_Film_FT]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[FT]  WITH CHECK ADD  CONSTRAINT [FK_Film_FT] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[FT] CHECK CONSTRAINT [FK_Film_FT]
GO
/****** Object:  ForeignKey [FK_FT_Tag]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[FT]  WITH CHECK ADD  CONSTRAINT [FK_FT_Tag] FOREIGN KEY([TID])
REFERENCES [dbo].[Tag] ([TID])
GO
ALTER TABLE [dbo].[FT] CHECK CONSTRAINT [FK_FT_Tag]
GO
/****** Object:  ForeignKey [FK_LikeList_Film]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[LikeList]  WITH CHECK ADD  CONSTRAINT [FK_LikeList_Film] FOREIGN KEY([FID])
REFERENCES [dbo].[Film] ([FID])
GO
ALTER TABLE [dbo].[LikeList] CHECK CONSTRAINT [FK_LikeList_Film]
GO
/****** Object:  ForeignKey [FK_LikeList_User]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[LikeList]  WITH CHECK ADD  CONSTRAINT [FK_LikeList_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[LikeList] CHECK CONSTRAINT [FK_LikeList_User]
GO
/****** Object:  ForeignKey [FK_Reply_Chat]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Reply]  WITH CHECK ADD  CONSTRAINT [FK_Reply_Chat] FOREIGN KEY([ChatID])
REFERENCES [dbo].[Chat] ([ChatID])
GO
ALTER TABLE [dbo].[Reply] CHECK CONSTRAINT [FK_Reply_Chat]
GO
/****** Object:  ForeignKey [FK_Reply_User]    Script Date: 11/21/2019 14:46:40 ******/
ALTER TABLE [dbo].[Reply]  WITH CHECK ADD  CONSTRAINT [FK_Reply_User] FOREIGN KEY([UID])
REFERENCES [dbo].[User] ([UID])
GO
ALTER TABLE [dbo].[Reply] CHECK CONSTRAINT [FK_Reply_User]
GO
