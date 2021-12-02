# readme
- 需要建表:
1. company
``` 
insert into company(comName,contacts,management,userName,password,telephone,registerTime,deleteFlag,role,vipend,vipbegin) values(#{comName},#{contacts},#{management},#{userName},#{password},#{telephone},#{registerTime},#{deleteFlag},#{role},#{vipend},#{vipbegin})
```

2. aboutus
   
```
DONE
```

3. admininfo
``` 
insert into adminInfo (adminName,realName,phone,role,password,addTime,delFlag) values (#{adminName},#{realName},#{phone},#{role},#{password},#{addTime},#{delFlag} )
```

4. assistant
``` 
insert into adminInfo (adminName,realName,phone,role,password,addTime,delFlag) values (#{adminName},#{realName},#{phone},#{role},#{password},#{addTime},#{delFlag} )
```

5. mflow
```
insert into mflow(title, detail, moduleid) values(#{title}, #{detail}, #{moduleid})
```

6. news
```
insert into news(category,title,msgpic,intro,content,publish,updatetime,disp,writer) values(#{category},#{title},#{msgpic},#{intro},#{content},#{publish},#{updatetime},#{disp},#{writer});
```
7. orders
```
insert into orders (
		orderNamech,orderNameen,summary,businessid,publishtime,
		img1,img2,img3,clickcount,goodsname,
		number,categoryid,specifications,price,supplytime,
		comid,details,recomflag,publishflag,tradeflag,
		supplyflag,delflag,updatetime,comname,category
		)VALUES(
			#{orderNamech,jdbcType=VARCHAR},#{orderNameen,jdbcType=VARCHAR},#{summary,jdbcType=VARCHAR},#{businessid,jdbcType=VARCHAR},#{publishtime,jdbcType=VARCHAR},
			#{img1,jdbcType=VARCHAR},#{img2,jdbcType=VARCHAR},#{img3,jdbcType=VARCHAR},#{clickcount,jdbcType=VARCHAR},#{goodsname,jdbcType=VARCHAR},
			#{number,jdbcType=VARCHAR},#{categoryid,jdbcType=VARCHAR},#{specifications,jdbcType=VARCHAR},#{price,jdbcType=VARCHAR},#{supplytime,jdbcType=VARCHAR},
			#{comid,jdbcType=VARCHAR},#{details,jdbcType=VARCHAR},#{recomflag,jdbcType=VARCHAR},#{publishflag,jdbcType=VARCHAR},#{tradeflag,jdbcType=VARCHAR},
			#{supplyflag,jdbcType=VARCHAR},0,now(),#{comname,jdbcType=VARCHAR},#{category,jdbcType=VARCHAR}
		)
```
- 建表后写出bean,dao以及test