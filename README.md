# readme
- 需要建表:
1. company
``` 
    <insert id="addcompany" parameterType="Company" >
		insert into company 
		(
			comName,contacts,telephone,userName,password,
			vipbegin,vipend,management,recommend,category,
			mainImage,brief,detailed,applyTime,registerTime,
			modifyTime,deleteFlag,status,role
		)
		VALUES
		(
			#{comName,jdbcType=VARCHAR},#{contacts,jdbcType=VARCHAR},#{telephone,jdbcType=VARCHAR},#{userName,jdbcType=VARCHAR},#{password,jdbcType=VARCHAR},
			#{vipbegin,jdbcType=DATE},#{vipend,jdbcType=DATE},#{management,jdbcType=VARCHAR},#{recommend,jdbcType=INTEGER},#{category,jdbcType=INTEGER},
			#{mainImage,jdbcType=VARCHAR},#{brief,jdbcType=VARCHAR},#{detailed,jdbcType=BLOB},#{applyTime,jdbcType=DATE},now(),
			now(),0,0,1
		
		)
    </insert>
```

2. aboutus
   
```

```