var login = {
    init: function () {
        login.renderBg(), window.addEventListener("resize", function () {
            login.renderBg()
        });
        var fullName = document.getElementById("login_fullname"), fun = "login.login()",
            forget_input = document.getElementById("forget_input");
        null != fullName ? (fun = "login.signup()", document.getElementById("login_fullname").addEventListener("keyup", function (e) {
            13 == e.keyCode && eval(fun)
        })) : null != forget_input && (fun = "login.forget()"), null != document.getElementById("login_email") && (document.getElementById("login_email").addEventListener("keyup", function (e) {
            13 == e.keyCode && eval(fun)
        }), null != document.getElementById("login_password") && document.getElementById("login_password").addEventListener("keyup", function (e) {
            13 == e.keyCode && eval(fun)
        })), $(".somemore").off("click.more").on("click.more", function (e) {
            e.stopPropagation(), $(".morelogo-con").toggleClass("popover")
        }), $(document).off("click.more").on("click.more", function () {
            $(".morelogo-con").removeClass("popover")
        }), setTimeout(function () {
            $(".error-tip").html("")
        }, 3e3)
    },
    showTip: function (e, n) {
        n.innerHTML = e, setTimeout(function () {
            n.innerHTML = ""
        }, 3e3)
    },
    isLogining: !1,
    login: function () {
        if (!login.isLogining) {
            var e = document, n = e.getElementById("login_email"), i = e.getElementById("login_password");
            if ("" == n.value.trim()) return n.focus(), void login.showTip("邮箱不能为空", n.nextElementSibling);
            if (!/^([\w]+)(.[\w]+)*@([\w-]+\.){1,5}([A-Za-z]){2,4}$/.test(n.value.trim())) return n.focus(), void login.showTip("邮箱格式不正确", n.nextElementSibling);
            if ("" == i.value.trim()) return i.focus(), void login.showTip("密码不能为空", i.parentNode.querySelector(".error-tip"));
            n.nextElementSibling.innerHTML = "", i.parentNode.querySelector(".error-tip").innerHTML = "", document.getElementsByClassName("logo-dot")[0].style.display = "inline-block", login.isLogining = !0, e.getElementById("login_email").value = n.value.trim(), e.getElementById("login_password").value = i.value.trim(), document.getElementById("loginform").submit()
        }
    },
    forget: function () {
        var e = document.getElementById("login_email"), n = document.getElementById("error-tip");
        if ("" == e.value.trim()) return e.focus(), void login.showTip("邮箱不能为空", n);
        if (!/^([\w]+)(.[\w]+)*@([\w-]+\.){1,5}([A-Za-z]){2,4}$/.test(e.value.trim())) return e.focus(), void login.showTip("邮箱格式不正确", n);
        var i = document.getElementsByClassName("logo-dot")[0];
        i.style.display = "inline-block", $.ajax({
            url: "/login/forgetpwd",
            type: "post",
            data: {email: e.value.trim()},
            success: function (n) {
                "noexists" == n.result ? (e.nextElementSibling.innerHTML = "发送邮件失败", e.focus()) : "success" == n.result && (e.nextElementSibling.innerHTML = "已经发送重置密码邮件，有效时间24小时 <a href='" + n.server + "' target='_blank'>请查收</a>"), e.nextElementSibling.style.display = "block", i.style.display = "none", login.isLogining = !1
            }
        }), login.weixin.loaded = !0
    },
    signup: function () {
        if (!login.isLogining) {
            var e = document, n = e.getElementById("login_email"), i = e.getElementById("login_password"),
                o = e.getElementById("login_fullname");
            if ("" != e.getElementById("signup_ticket").value.trim()) {
                if ("" == n.value.trim()) return n.focus(), void login.showTip("邮箱不能为空", n.nextElementSibling);
                if (!/^([\w]+)(.[\w]+)*@([\w-]+\.){1,5}([A-Za-z]){2,4}$/.test(n.value.trim())) return n.focus(), void login.showTip("邮箱格式不正确", n.nextElementSibling);
                if ($.inArray($.trim(n.value), login.tempmails) >= 0) return n.focus(), void login.showTip("此类型邮箱暂不支持", n.nextElementSibling);
                if ("" == i.value.trim()) return i.focus(), void login.showTip("密码不能为空", i.nextElementSibling);
                if ("" == o.value.trim()) return o.focus(), void login.showTip("昵称不能为空", o.nextElementSibling);
                if (o.value.length > 15) return o.focus(), void login.showTip("昵称最大长度为15位", o.nextElementSibling);
                e.getElementById("login_email").value = n.value.trim(), e.getElementById("login_password").value = i.value.trim(), e.getElementById("login_fullname").value = o.value.trim(), n.nextElementSibling.innerHTML = "", i.nextElementSibling.innerHTML = "", o.nextElementSibling.innerHTML = "", document.getElementsByClassName("logo-dot")[0].style.display = "inline-block", login.isLogining = !0, document.getElementById("signup_form").submit()
            }
        }
    },
    bind: function () {
        var e = $("#login_email"), n = $("#login_password"), i = document.getElementById("login_email"),
            o = document.getElementById("login_password");
        if ("" == $.trim(e.val()) || 0 == $.trim(e.val()).isEmail() || "" == $.trim(n.val())) {
            if ("" == $.trim(e.val()) || 0 == $.trim(e.val()).isEmail()) {
                e.focus();
                i = document.getElementById("login_email");
                return login.showTip("邮箱格式不正确", i.nextElementSibling), !1
            }
            if ("" == $.trim(n.val())) return n.focus(), login.showTip("请输入密码", o.nextElementSibling), !1
        } else {
            if ("" == $.trim(e.val()) || !$.trim(e.val()).isEmail() || "" == $.trim(n.val())) return e.focus(), login.showTip("邮箱格式不正确", i.nextElementSibling), !1;
            if (!$.trim(n.val()).match("^.{6,24}$")) return n.focus(), login.showTip("密码格式错误", o.nextElementSibling), !1;
            e.val($.trim(e.val())), n.val($.trim(n.val())), $("#signin_bind_form").submit()
        }
    },
    renderBg: function () {
        var e = document.getElementById("bg-canvas"), n = document.documentElement.clientWidth,
            i = document.documentElement.clientHeight;
        e.width = n, e.height = i;
        var o = e.getContext("2d");
        o.strokeStyle = "#f6f6f6", o.lineWidth = 1, o.beginPath(), o.translate(.5, .5);
        for (t = 20; t <= i; t += 20) o.moveTo(0, t), o.lineTo(n, t);
        for (var t = 20; t <= n; t += 20) o.moveTo(t, 0), o.lineTo(t, i);
        o.closePath(), o.stroke()
    },
    paltform: {
        weixin: function () {
            login.weixin.init()
        }, login: function (e) {
            if ("google" == e) {
                n = "https://accounts.google.com/o/oauth2/auth?redirect_uri=http://www.processon.com/google.jsp&response_type=token&client_id=524693152001.apps.googleusercontent.com&scope=https://www.googleapis.com/auth/userinfo.profile+https://www.googleapis.com/auth/userinfo.email";
                window.open(n, "newwindow", "height=550, width=900, top=0, left=0, toolbar=no, menubar=no, scrollbars=no,resizable=no,location=no, status=no")
            } else if ("qq" == e) {
                n = "https://graph.qq.com/oauth2.0/authorize?client_id=100485241&response_type=token&scope=all&redirect_uri=http://www.processon.com/qq.jsp";
                window.open(n, "newwindow", "height=550, width=900, top=0, left=0, toolbar=no, menubar=no, scrollbars=no,resizable=no,location=no, status=no")
            } else if ("sina" == e) {
                n = "https://api.weibo.com/oauth2/authorize?client_id=355778041&response_type=code&redirect_uri=http://www.processon.com/login/sina";
                window.open(n, "newwindow", "height=550, width=900, top=0, left=0, toolbar=no, menubar=no, scrollbars=no,resizable=no,location=no, status=no")
            } else if ("mingdao" == e) {
                var n = "https://api.mingdao.com/oauth2/authorize?app_key=5967E9E0B4ADA1B9C23B1893ABAED0F&response_type=code&redirect_uri=http://www.processon.com/login/mingdao";
                window.open(n, "newwindow", "height=550, width=900, top=0, left=0, toolbar=no, menubar=no, scrollbars=no,resizable=no,location=no, status=no")
            }
        }
    },
    weixin: {
        loaded: !1, init: function () {
            var e = document.getElementById("weixin_dlg");
            if (e.style.display = "block", !login.weixin.loaded) {
                var n = {js: ["https://res.wx.qq.com/connect/zh_CN/htmledition/js/wxLogin.js"]};
                bigPipe.render(n, function () {
                    setTimeout(function () {
                        new WxLogin({
                            id: "weixin_dlg",
                            appid: "wx7b2c94939579c89c",
                            scope: "snsapi_login",
                            redirect_uri: "https://www.processon.com/login/weixin",
                            state: "",
                            style: "",
                            href: ""
                        });
                        document.addEventListener("mousedown", function () {
                            e.style.display = "none"
                        }), e.addEventListener("mousedown", function (e) {
                            e.stopPropagation()
                        }), login.weixin.loaded = !0
                    }, 1e3)
                })
            }
        }
    },
    tempmails: ["mvrht.com", "34nm.com", "dingbone.com", "fudgerub.com", "lookugly.com", "smellfear.com", "tempinbox.com", "yopmail.com", "yopmail.fr", "yopmail.net", "cool.fr.nf", "jetable.fr.nf", "nospam.ze.tc", "nomail.xl.cx", "mega.zik.dj", "speed.1s.fr", "courriel.fr.nf", "moncourrier.fr.nf", "monemail.fr.nf", "monmail.fr.nf", "chacuo.net", "027168.com", "www.bccto.me", "mail.bccto.me", "sharklasers.com", "guerrillamail.info", "grr.la", "guerrillamail.biz", "guerrillamail.com", "guerrillamail.de", "guerrillamail.net", "guerrillamail.org", "guerrillamailblock.com", "pokemail.net", "spam4.me", "nowmymail.com", "mailcatch.com", "incognitomail.org", "cd.mintemail.com", "spamgourmet.com", "e4ward.com", "mailinator.com", "spamfree24.org", "mt2015.com", "mailnesia.com", "tempemail.net", "maildrop.cc"]
};
login.init();